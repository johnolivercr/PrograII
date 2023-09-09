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

-- Paso 3: 
-- Creear una tabla llamada "Clientes" con las siguientes columnas:
-- ID (Clave primaria)
-- Nombre
-- Email
-- Teléfono
CREATE TABLE [dbo].[Clientes] (
    [ID]		INT             IDENTITY (1, 1) NOT NULL,
    [Nombre]	NVARCHAR (50)   NOT NULL,
    [Email ]	NVARCHAR (200)  NOT NULL,
    [Telefono]  nvarchar(15)    NOT NULL,
    CONSTRAINT [PK_Clientes] PRIMARY KEY CLUSTERED ([ID] ASC)
);

-- Consultas generales
select * from Clientes
select * from Productos
-- Consulta que retorne unicamente nombre y precio
select Nombre, Precio from Productos
-- 
select * from Productos where ID = 5;
select * from Clientes  where ID = 2;
select * from Clientes  where [Email ] = 'jquesada1@gmail.com'

--  Agregar registros
insert into Clientes ([Nombre], [Email ], [Telefono]) values('John Quesada'		, 'jquesada@gmail.com' , '88888888');
insert into Clientes ([Nombre], [Email ], [Telefono]) values('Andrey Quesada'	, 'jquesada1@gmail.com', '88888888');
insert into Clientes ([Nombre], [Email ], [Telefono]) values('Saul Quesada'		, 'jquesada2@gmail.com', '88888888');
insert into Clientes ([Nombre], [Email ], [Telefono]) values('Jennifer Quesada'	, 'jquesada3@gmail.com', '88888888');
insert into Clientes ([Nombre], [Email ], [Telefono]) values('Pedro Quesada'	, 'jquesada4@gmail.com', '88888888');

insert into Productos ([Nombre], [Precio], [Stock]) values('Peras',		100.00, 5);
insert into Productos ([Nombre], [Precio], [Stock]) values('Manzanas',	100.00, 5);
insert into Productos ([Nombre], [Precio], [Stock]) values('Bananos',	100.00, 5);
insert into Productos ([Nombre], [Precio], [Stock]) values('Tomates',	100.00, 5);
insert into Productos ([Nombre], [Precio], [Stock]) values('Repollo',	100.00, 5);