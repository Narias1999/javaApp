/*
Navicat MySQL Data Transfer

Source Server         : java
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : java

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-30 09:54:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `arl`
-- ----------------------------
DROP TABLE IF EXISTS `arl`;
CREATE TABLE `arl` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of arl
-- ----------------------------

-- ----------------------------
-- Table structure for `aseguradora`
-- ----------------------------
DROP TABLE IF EXISTS `aseguradora`;
CREATE TABLE `aseguradora` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of aseguradora
-- ----------------------------

-- ----------------------------
-- Table structure for `bancos`
-- ----------------------------
DROP TABLE IF EXISTS `bancos`;
CREATE TABLE `bancos` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bancos
-- ----------------------------

-- ----------------------------
-- Table structure for `caja_compensacion`
-- ----------------------------
DROP TABLE IF EXISTS `caja_compensacion`;
CREATE TABLE `caja_compensacion` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of caja_compensacion
-- ----------------------------

-- ----------------------------
-- Table structure for `cargos`
-- ----------------------------
DROP TABLE IF EXISTS `cargos`;
CREATE TABLE `cargos` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cargos
-- ----------------------------

-- ----------------------------
-- Table structure for `ciudad`
-- ----------------------------
DROP TABLE IF EXISTS `ciudad`;
CREATE TABLE `ciudad` (
  `cod` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `dpto` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod`),
  KEY `departamento` (`dpto`),
  CONSTRAINT `departamento` FOREIGN KEY (`dpto`) REFERENCES `dptos` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ciudad
-- ----------------------------

-- ----------------------------
-- Table structure for `contrato_diferente`
-- ----------------------------
DROP TABLE IF EXISTS `contrato_diferente`;
CREATE TABLE `contrato_diferente` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tp_ctto` varchar(30) DEFAULT NULL,
  `num_doc` varchar(15) DEFAULT NULL,
  `nom_pers` varchar(50) DEFAULT NULL,
  `dir` varchar(15) DEFAULT NULL,
  `cel` varchar(15) DEFAULT NULL,
  `correo` varchar(15) DEFAULT NULL,
  `fch_ini` varchar(15) DEFAULT NULL,
  `fch_term` varchar(15) DEFAULT NULL,
  `serv_obj_ctto` varchar(30) DEFAULT NULL,
  `val_ctto` int(15) DEFAULT NULL,
  `aporte_seg_soc` int(15) DEFAULT NULL,
  `aporte_arl` int(15) DEFAULT NULL,
  `aporte_pension` int(15) DEFAULT NULL,
  `arl` int(15) DEFAULT NULL,
  `vto_soat` varchar(15) DEFAULT NULL,
  `vto_tecnomecanica` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `num_doc` (`num_doc`),
  CONSTRAINT `contrato_diferente_ibfk_1` FOREIGN KEY (`num_doc`) REFERENCES `empleados_contratista` (`num_doc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of contrato_diferente
-- ----------------------------

-- ----------------------------
-- Table structure for `datos_contrato`
-- ----------------------------
DROP TABLE IF EXISTS `datos_contrato`;
CREATE TABLE `datos_contrato` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tp_ctto` varchar(30) DEFAULT NULL,
  `num_doc` varchar(15) DEFAULT NULL,
  `fch_ing` varchar(15) DEFAULT NULL,
  `fch_retiro` varchar(15) DEFAULT NULL,
  `institucion` varchar(50) DEFAULT NULL,
  `nit` varchar(15) DEFAULT NULL,
  `cod_zona` int(10) DEFAULT NULL,
  `cod_ciudad` int(10) DEFAULT NULL,
  `salario_basico` int(15) DEFAULT NULL,
  `cod_bancos` varchar(10) DEFAULT NULL,
  `tp_cta` varchar(20) DEFAULT NULL,
  `num_cta` int(20) DEFAULT NULL,
  `periodo_pago` varchar(20) DEFAULT NULL,
  `cod_fon_salud` varchar(10) DEFAULT NULL,
  `cod_arl` varchar(10) DEFAULT NULL,
  `atep` int(10) DEFAULT NULL,
  `tipo` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cod_ciudad` (`cod_ciudad`),
  KEY `cod_bancos` (`cod_bancos`),
  KEY `cod_fon_salud` (`cod_fon_salud`),
  KEY `cod_arl` (`cod_arl`),
  KEY `num_doc` (`num_doc`),
  KEY `cod_zona` (`cod_zona`),
  CONSTRAINT `datos_contrato_ibfk_2` FOREIGN KEY (`cod_bancos`) REFERENCES `bancos` (`cod`),
  CONSTRAINT `datos_contrato_ibfk_3` FOREIGN KEY (`cod_fon_salud`) REFERENCES `fondo_salud` (`cod`),
  CONSTRAINT `datos_contrato_ibfk_4` FOREIGN KEY (`cod_arl`) REFERENCES `arl` (`cod`),
  CONSTRAINT `datos_contrato_ibfk_5` FOREIGN KEY (`num_doc`) REFERENCES `empleados_contratista` (`num_doc`),
  CONSTRAINT `datos_contrato_ibfk_6` FOREIGN KEY (`cod_zona`) REFERENCES `zonas` (`cod`),
  CONSTRAINT `datos_contrato_ibfk_7` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of datos_contrato
-- ----------------------------

-- ----------------------------
-- Table structure for `det_permiso_vacaciones`
-- ----------------------------
DROP TABLE IF EXISTS `det_permiso_vacaciones`;
CREATE TABLE `det_permiso_vacaciones` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `num_doc` varchar(15) DEFAULT NULL,
  `cod_permiso` int(10) DEFAULT NULL,
  `hor_fch_desde` varchar(20) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `hor_fch_hasta` varchar(20) DEFAULT NULL,
  `obs` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cod_permiso` (`cod_permiso`),
  KEY `num_doc` (`num_doc`),
  CONSTRAINT `det_permiso_vacaciones_ibfk_1` FOREIGN KEY (`cod_permiso`) REFERENCES `permisos_vaciones` (`cod`),
  CONSTRAINT `det_permiso_vacaciones_ibfk_2` FOREIGN KEY (`num_doc`) REFERENCES `empleados_contratista` (`num_doc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of det_permiso_vacaciones
-- ----------------------------

-- ----------------------------
-- Table structure for `dptos`
-- ----------------------------
DROP TABLE IF EXISTS `dptos`;
CREATE TABLE `dptos` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dptos
-- ----------------------------

-- ----------------------------
-- Table structure for `empleados_contratista`
-- ----------------------------
DROP TABLE IF EXISTS `empleados_contratista`;
CREATE TABLE `empleados_contratista` (
  `num_doc` varchar(15) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `tp_doc` varchar(20) DEFAULT NULL,
  `f_expedicion` varchar(20) DEFAULT NULL,
  `dpto_cod` varchar(10) DEFAULT NULL,
  `cod_ciudad` int(10) DEFAULT NULL,
  `f_nac` varchar(20) DEFAULT NULL,
  `cod_dptos` varchar(10) DEFAULT NULL,
  `cod_ciud` int(10) DEFAULT NULL,
  `RH` varchar(5) DEFAULT NULL,
  `genero` varchar(15) DEFAULT NULL,
  `edad` int(5) DEFAULT NULL,
  `num_hijos` int(5) DEFAULT NULL,
  `est_civil` varchar(20) DEFAULT NULL,
  `dir` varchar(100) DEFAULT NULL,
  `tlf` varchar(15) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `foto` varchar(50) DEFAULT NULL COMMENT '1 empleado 2 contratista',
  `tipo` int(1) DEFAULT NULL COMMENT 'Tipo 1 Empleado, 2 contratista',
  PRIMARY KEY (`num_doc`),
  KEY `dpto_cod` (`dpto_cod`),
  KEY `cod_dptos` (`cod_dptos`),
  KEY `cod_ciudad` (`cod_ciudad`),
  KEY `cod_ciud` (`cod_ciud`),
  CONSTRAINT `empleados_contratista_ibfk_1` FOREIGN KEY (`dpto_cod`) REFERENCES `dptos` (`cod`),
  CONSTRAINT `empleados_contratista_ibfk_3` FOREIGN KEY (`cod_dptos`) REFERENCES `dptos` (`cod`),
  CONSTRAINT `empleados_contratista_ibfk_4` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`cod`),
  CONSTRAINT `empleados_contratista_ibfk_5` FOREIGN KEY (`cod_ciud`) REFERENCES `ciudad` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of empleados_contratista
-- ----------------------------

-- ----------------------------
-- Table structure for `fondo_pensiones`
-- ----------------------------
DROP TABLE IF EXISTS `fondo_pensiones`;
CREATE TABLE `fondo_pensiones` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of fondo_pensiones
-- ----------------------------

-- ----------------------------
-- Table structure for `fondo_salud`
-- ----------------------------
DROP TABLE IF EXISTS `fondo_salud`;
CREATE TABLE `fondo_salud` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of fondo_salud
-- ----------------------------

-- ----------------------------
-- Table structure for `listado_cursos`
-- ----------------------------
DROP TABLE IF EXISTS `listado_cursos`;
CREATE TABLE `listado_cursos` (
  `cod` varchar(10) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of listado_cursos
-- ----------------------------

-- ----------------------------
-- Table structure for `permisos_vaciones`
-- ----------------------------
DROP TABLE IF EXISTS `permisos_vaciones`;
CREATE TABLE `permisos_vaciones` (
  `cod` int(10) NOT NULL,
  `num_doc` varchar(15) DEFAULT NULL,
  `tipo` varchar(1) DEFAULT NULL COMMENT '1 vacaciones 2 permisos',
  PRIMARY KEY (`cod`),
  KEY `cod` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of permisos_vaciones
-- ----------------------------

-- ----------------------------
-- Table structure for `registro_contratos`
-- ----------------------------
DROP TABLE IF EXISTS `registro_contratos`;
CREATE TABLE `registro_contratos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tp_ctto` varchar(50) DEFAULT NULL,
  `num_doc` int(15) DEFAULT NULL,
  `cargos_cod` varchar(10) DEFAULT NULL,
  `tp_cargo` varchar(50) DEFAULT NULL,
  `fch_ing` varchar(20) DEFAULT NULL,
  `fch_retiro` varchar(20) DEFAULT NULL,
  `zona_lab` varchar(10) DEFAULT NULL,
  `cod_ciudad` varchar(10) DEFAULT NULL,
  `salario_basico` int(15) DEFAULT NULL,
  `aux_mov` int(15) DEFAULT NULL,
  `aux_transp` int(15) DEFAULT NULL,
  `cod_banco_cta` varchar(10) DEFAULT NULL,
  `tp_cta` varchar(20) DEFAULT NULL,
  `num_cta` int(20) DEFAULT NULL,
  `per_pago` varchar(20) DEFAULT NULL,
  `fon_salud` varchar(50) DEFAULT NULL,
  `fon_pensiones` varchar(50) DEFAULT NULL,
  `caja_compensaccion` varchar(50) DEFAULT NULL,
  `cod_arl` varchar(50) DEFAULT NULL,
  `porcATEP` int(10) DEFAULT NULL,
  `motocicleta` char(1) DEFAULT NULL,
  `placa` varchar(6) DEFAULT NULL,
  `modelo` varchar(4) DEFAULT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `cilindraje` varchar(15) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `SOAT` varchar(40) DEFAULT NULL,
  `cod_aseguradora` varchar(10) DEFAULT NULL,
  `f_vencimiento` varchar(20) DEFAULT NULL,
  `cod_curso` varchar(10) DEFAULT NULL,
  `institucion` varchar(50) DEFAULT NULL,
  `f_certificacion` varchar(20) DEFAULT NULL,
  `f_venci_certficacion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cargos_cod` (`cargos_cod`),
  KEY `cod_zona_lab` (`zona_lab`),
  KEY `cod_ciudad` (`cod_ciudad`),
  KEY `cod_banco_cta` (`cod_banco_cta`),
  KEY `fon_salud` (`fon_salud`),
  KEY `fon_pensiones` (`fon_pensiones`),
  KEY `caja_compensaccion` (`caja_compensaccion`),
  KEY `cod_arl` (`cod_arl`),
  KEY `cod_aseguradora` (`cod_aseguradora`),
  KEY `cod_curso` (`cod_curso`),
  CONSTRAINT `registro_contratos_ibfk_1` FOREIGN KEY (`cargos_cod`) REFERENCES `cargos` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_10` FOREIGN KEY (`cod_curso`) REFERENCES `listado_cursos` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_3` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudades` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_4` FOREIGN KEY (`cod_banco_cta`) REFERENCES `bancos` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_5` FOREIGN KEY (`fon_salud`) REFERENCES `fondo_salud` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_6` FOREIGN KEY (`fon_pensiones`) REFERENCES `fondo_pensiones` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_7` FOREIGN KEY (`caja_compensaccion`) REFERENCES `caja_compensacion` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_8` FOREIGN KEY (`cod_arl`) REFERENCES `arl` (`cod`),
  CONSTRAINT `registro_contratos_ibfk_9` FOREIGN KEY (`cod_aseguradora`) REFERENCES `aseguradora` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of registro_contratos
-- ----------------------------

-- ----------------------------
-- Table structure for `usuarios`
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `usuario` varchar(30) NOT NULL,
  `contraseña` int(30) DEFAULT NULL,
  `rol` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of usuarios
-- ----------------------------

-- ----------------------------
-- Table structure for `zonas`
-- ----------------------------
DROP TABLE IF EXISTS `zonas`;
CREATE TABLE `zonas` (
  `cod` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `cod_ciudad` int(10) DEFAULT NULL,
  PRIMARY KEY (`cod`),
  KEY `cod_ciudad` (`cod_ciudad`),
  CONSTRAINT `zonas_ibfk_1` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of zonas
-- ----------------------------
