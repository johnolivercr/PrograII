Use Tienda
go


CREATE TABLE [dbo].[Productos] (
    [ID]     INT             IDENTITY (1, 1) NOT NULL,
    [Nombre] NVARCHAR (50)   NOT NULL,
    [Precio] DECIMAL (18, 2) NOT NULL,
    [Stock]  INT             NOT NULL,
    CONSTRAINT [PK_Productos] PRIMARY KEY CLUSTERED ([ID] ASC)
);