USE nba;

-- Primer ejercicio
SELECT 
    nombre
FROM
    jugadores
ORDER BY nombre ASC;

-- Segundo ejercicio
SELECT 
    nombre, posicion, peso
FROM
    jugadores
WHERE
    Posicion = 'C' AND Peso > 200
ORDER BY nombre;
 
-- tercero
SELECT 
    nombre
FROM
    equipos
ORDER BY nombre ASC;

-- Cuarto 
SELECT 
    nombre, conferencia
FROM
    equipos
WHERE
    conferencia = 'east'
ORDER BY nombre ASC;

-- Quinto 
SELECT 
    nombre, ciudad
FROM
    equipos
WHERE
    ciudad LIKE 'c%';


-- Sexto
SELECT 
    nombre, nombre_equipo
FROM
    jugadores
ORDER BY nombre_equipo;

-- Septimo 
SELECT 
    nombre, nombre_equipo AS Equipo
FROM
    jugadores
WHERE
    nombre_equipo = 'Raptors'
ORDER BY nombre;


-- Octavo
SELECT 
    jugadores.nombre,
    ROUND(AVG(estadisticas.puntos_por_partido), 1) AS puntos_prom_partido
FROM
    jugadores
        INNER JOIN
    estadisticas ON jugadores.codigo = estadisticas.jugador
WHERE
    jugadores.Nombre = 'Pau Gasol';


-- consulta 9
SELECT 
    nombre, temporada, puntos_por_partido
FROM
    jugadores
        INNER JOIN
    estadisticas ON jugadores.codigo = estadisticas.jugador
WHERE
    temporada = '04/05'
        AND nombre = 'Pau Gasol';

-- consulta 10
SELECT 
    nombre, ROUND(SUM(puntos_por_partido)) as Puntos_carrera
FROM
    jugadores
        INNER JOIN
    estadisticas ON jugadores.codigo = estadisticas.jugador
GROUP BY nombre
ORDER BY nombre;

-- Consulta 11
SELECT nombre_equipo, count(nombre) as total_jugadores
FROM jugadores
GROUP BY nombre_equipo;


-- Consulta 12
SELECT 