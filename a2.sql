-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 17-02-2020 a las 03:37:53
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `a2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_id` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de cliente',
  `cli_nombre` varchar(50) NOT NULL COMMENT 'Nombre de cliente',
  `cli_rfc` varchar(15) NOT NULL COMMENT 'RFC de cliente',
  `cli_moneda` varchar(20) NOT NULL COMMENT 'Moneda (dolar o mxn)',
  `cli_nprecio` varchar(50) NOT NULL COMMENT 'Nombre del tipo de precio (Universidad, hospital, etc)',
  `cli_credito` tinyint(1) NOT NULL COMMENT 'Permitir credito si o no',
  `cli_direc` varchar(100) NOT NULL COMMENT 'Direccion de cliente',
  `cli_cp` varchar(10) NOT NULL COMMENT 'codigo postal de cliente',
  `cli_tel` varchar(15) NOT NULL COMMENT 'Telefono de cliente',
  PRIMARY KEY (`cli_id`),
  KEY `cli_nombre` (`cli_nombre`),
  KEY `cli_nprecio__p_nombre` (`cli_nprecio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla con el catalogo de clientes';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

DROP TABLE IF EXISTS `empresa`;
CREATE TABLE IF NOT EXISTS `empresa` (
  `em_rfc` varchar(20) NOT NULL COMMENT 'RFC',
  `em_camara` varchar(20) NOT NULL COMMENT 'Registro de camara',
  `em_estatal` varchar(20) NOT NULL COMMENT 'Cuenta estatal',
  `em_representante` varchar(50) NOT NULL COMMENT 'Representante legal',
  `em_direccion` varchar(50) NOT NULL COMMENT 'Direccion fisica',
  `em_cp` varchar(10) NOT NULL COMMENT 'Codigo postal',
  `em_tel` varchar(10) NOT NULL COMMENT 'Telefono'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla de datos de la empresa';

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`em_rfc`, `em_camara`, `em_estatal`, `em_representante`, `em_direccion`, `em_cp`, `em_tel`) VALUES
('PECA 630130EG1', '987654321', '987654123', 'Antonio Preciado Cueva', 'Calle Juan Palomar y Arias num 2289', '44320', '36734513');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturacion`
--

DROP TABLE IF EXISTS `facturacion`;
CREATE TABLE IF NOT EXISTS `facturacion` (
  `fac_id` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de factura',
  `fac_id_cliente` int(5) NOT NULL COMMENT 'Id del cliente',
  `fac_nombre_cliente` varchar(50) NOT NULL COMMENT 'Nombre del cliente',
  `fac_fecha` varchar(50) NOT NULL COMMENT 'Fecha de factura',
  `fac_precio` varchar(50) NOT NULL COMMENT 'Tipo de precio universidad, hospital, etc',
  `fac_servicio` varchar(50) NOT NULL COMMENT 'Servicio facturado',
  `fac_subtotal` varchar(100) NOT NULL COMMENT 'Subtotal de factura',
  `fac_total` varchar(100) NOT NULL COMMENT 'Total de factura',
  PRIMARY KEY (`fac_id`),
  KEY `fac_id_cliente` (`fac_id_cliente`),
  KEY `fac_nombre__cli_nombre` (`fac_nombre_cliente`),
  KEY `fac_precio__p_nombre` (`fac_precio`),
  KEY `fac_servicio__ser_corto` (`fac_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla con las facturas o notas de venta';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio`
--

DROP TABLE IF EXISTS `precio`;
CREATE TABLE IF NOT EXISTS `precio` (
  `p_id` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de precio',
  `p_nombre` varchar(50) NOT NULL COMMENT 'Nombre del tipo de precio',
  `p_costo` int(10) NOT NULL COMMENT 'Costo en efectivo',
  PRIMARY KEY (`p_id`),
  KEY `p_costo` (`p_costo`),
  KEY `p_nombre` (`p_nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla con la lista de precios que relaciona el tipo';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

DROP TABLE IF EXISTS `servicios`;
CREATE TABLE IF NOT EXISTS `servicios` (
  `ser_id` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de servicio',
  `ser_nombre` varchar(50) NOT NULL COMMENT 'Nombre de servicio',
  `ser_corto` varchar(50) NOT NULL COMMENT 'nombre corto de servcio',
  `ser_desc` varchar(100) NOT NULL COMMENT 'Descripcion de servicio',
  `ser_uni` varchar(50) NOT NULL COMMENT 'Unidad de medida de servicio',
  `ser_pre` int(10) NOT NULL COMMENT 'Precio de servicio',
  PRIMARY KEY (`ser_id`),
  KEY `ser_corto` (`ser_corto`),
  KEY `ser_pre__p_costo` (`ser_pre`),
  KEY `ser_uni__uni_corto` (`ser_uni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla con los servicios que se ofrecen';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `univ`
--

DROP TABLE IF EXISTS `univ`;
CREATE TABLE IF NOT EXISTS `univ` (
  `uni_id` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de unidad de venta',
  `uni_nombre` varchar(50) NOT NULL COMMENT 'Nombre largo de unidad de venta',
  `uni_corto` varchar(25) NOT NULL COMMENT 'Nombre corto de unidad de venta',
  PRIMARY KEY (`uni_id`),
  KEY `uni_corto` (`uni_corto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla con las unidades de venta';

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `cli_nprecio__p_nombre` FOREIGN KEY (`cli_nprecio`) REFERENCES `precio` (`p_nombre`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `facturacion`
--
ALTER TABLE `facturacion`
  ADD CONSTRAINT `fac_idcliente__cli_id` FOREIGN KEY (`fac_id_cliente`) REFERENCES `clientes` (`cli_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fac_nombre__cli_nombre` FOREIGN KEY (`fac_nombre_cliente`) REFERENCES `clientes` (`cli_nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fac_precio__p_nombre` FOREIGN KEY (`fac_precio`) REFERENCES `precio` (`p_nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fac_servicio__ser_corto` FOREIGN KEY (`fac_servicio`) REFERENCES `servicios` (`ser_corto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `ser_pre__p_costo` FOREIGN KEY (`ser_pre`) REFERENCES `precio` (`p_costo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ser_uni__uni_corto` FOREIGN KEY (`ser_uni`) REFERENCES `univ` (`uni_corto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
