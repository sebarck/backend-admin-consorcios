-- Create a new table called '[Reclamos]' in schema '[dbo]'
-- Drop the table if it already exists
IF OBJECT_ID('[dbo].[Reclamos]', 'U') IS NOT NULL
DROP TABLE [dbo].[Reclamos]
GO
-- Create the table in the specified schema
CREATE TABLE [dbo].[Reclamos]
(
    [Id] INT NOT NULL PRIMARY KEY,
    -- Primary Key column
    [id_categoria] INT NOT NULL,
    [titulo] NVARCHAR(50) NOT NULL,
    [descripcion] NVARCHAR(500) NOT NULL,
    [estado] INT NOT NULL,
    [notas] NVARCHAR(1000),
    [id_edificio] INT NOT NULL,
    [id_persona] INT NOT NULL,
    [id_inspector] INT,
    [evidencia] IMAGE,
    [fecha_creacion] DATE NOT NULL,
    [fecha_vencimiento] DATE,
    [fecha_comienzo_obras] DATE,
    [fecha_resolucion] DATE,
);
GO