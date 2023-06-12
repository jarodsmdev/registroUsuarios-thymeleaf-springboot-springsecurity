
# Aplicación de Registro de Usuarios

Esta es una aplicación web desarrollada con Spring Boot, Thymeleaf, Spring Security, JPA Hibernate y Bootstrap. Permite registrar usuarios, iniciar sesión y obtener un listado de los usuarios registrados.

## Requisitos previos

- JDK 8 o superior
- Maven
- MySQL

## Configuración de la base de datos

1. Crea una base de datos en MySQL con el nombre "registro_usuarios_springboot".
2. Actualiza las configuraciones de la base de datos en el archivo `application.properties`. Puedes encontrar este archivo en la ruta `src/main/resources`.
    - Actualiza la URL de la base de datos (`spring.datasource.url`), el nombre de usuario (`spring.datasource.username`) y la contraseña (`spring.datasource.password`) según tu configuración de MySQL.

## Ejecutar la aplicación

1. Abre una terminal y navega hasta el directorio raíz del proyecto.
2. Ejecuta el siguiente comando para compilar el proyecto:
   ```
   mvn clean install
   ```
3. Después de que la compilación sea exitosa, ejecuta el siguiente comando para iniciar la aplicación:
   ```
   mvn spring-boot:run
   ```
4. La aplicación se ejecutará en `http://localhost:8080`. Abre tu navegador web y ve a esa URL para acceder a la aplicación.

## Registro e inicio de sesión

- En la página de inicio, puedes registrarte como un nuevo usuario. Proporciona tu nombre, apellido, email y contraseña.
- Después de registrarte, puedes iniciar sesión utilizando tu email y contraseña.
- Una vez que hayas iniciado sesión, podrás acceder al listado de usuarios registrados.

## Contribución

Si deseas contribuir a este proyecto, siéntete libre de hacer fork del repositorio y enviar tus pull requests.