Use Tienda
go

-- Paso 1: 
-- Crear base de datos Tienda
CREATE DATABASE [Tienda]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Tienda', FILENAME = N'C:\Backup\Tienda.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Tienda_log', FILENAME = N'C:\Backup\Tienda_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO

-- Paso 2: 
-- Crear una tabla llamada "Productos" con las siguientes columnas:
-- ID (Clave primaria)
-- Nombre
-- Precio
-- Stock
CREATE TABLE [dbo].[Productos] (
    [ID]     INT             IDENTITY (1, 1) NOT NULL,
    [Nombre] NVARCHAR (50)   NOT NULL,
    [Precio] DECIMAL (18, 2) NOT NULL,
    [Stock]  INT             NOT NULL,
    CONSTRAINT [PK_Productos] PRIMARY KEY CLUSTERED ([ID] ASC)
);