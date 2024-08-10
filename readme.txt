# Instrucciones de Configuración
1. **Instalación de dependencias de Maven**:
   - Asegúrate de tener [Maven](https://maven.apache.org) instalado.
   - Ejecuta `mvn clean install` para instalar todas las dependencias del proyecto y compilar el código.

# Scripts de ejecución
- Las pruebas de Karate se ejecutan desde la clase `TestRunner.java` utilizando JUnit 5.
   - Para ejecutar todas las pruebas desde la línea de comandos, usa el siguiente comando:
     ```bash
     mvn test
     ```