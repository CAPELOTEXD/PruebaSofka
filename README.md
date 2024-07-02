Para Poder ejecutar este archivo es encesario tener instaladas las siguientes versiones.
* java 1.8 la podemos descargar de la siguiente link  https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html
* una ve slo tengamos le damos instalar o si escoges la opcion de zip debes ocnfigurar las variables de entorno.
* tambien debemos descargar gradle en este caso la version 7.2 las puedes bajar del siguiente link  https://gradle.org/releases/?_gl=1*pa56a9*_gcl_au*NTcyMjA0MDAxLjE3MTk1Mzc2OTE.*_ga*MjA3Mzk3OTg0LjE3MTk1Mzc2OTE.*_ga_7W7NC6YNPT*MTcxOTkwMDQyMi4zLjEuMTcxOTkwMDQyNy41NS4wLjA.
* buscamos la version 7.2 y lo podemos corraborar con el comenado Gradle -v  y java -version para saber si ya lotenemos instalado en nuestro equipo.
* par ala version de gradle e snecesario con figurar las variables de entorno.

* una ves instalado los archivos procedemos a abrir intelij y abrir nuestro proyecto.
* esperamos que carguen las dependencias y ejecutamos.
* validamos los escenarios por consolo o en la carpeta target podemos abrir el archivo que dice index.html y ver el estatus de nuestras pruebas.

  esto para nuestra automatizacion.

  para realzia rlas preubas de carga debemos instalar apache jmeter lo cual podemos obtenerlo del siguient enlace https://jmeter.apache.org/download_jmeter.cgi
  esperamos que descargue y eabrimos en la carpeta bin la opcon que dice apache
  alli damos en file y damos abrir archivo, seleccionamos nuestro archivo y el lo traera
  cuando se haya cargado el archivo le damos en el boton de play y para ver el resultado podemos ver las siguientes funcionalidades configuradas:
  - summary report nos muestra la cantidad de meustras realizadas y el max alcanzado la cantidad de bytes consumidos
  - grap result es una grafica que nos va informando el flujo de nuestro servicio de cuando peude colgarse o cuando alcanza los picos de error altos
  - - arbol resul tree o arbol de resultados aqui vemos la cantidad de peticiones realziadas si fue correcta o co nerror nos muestra la respuesta de cada peticion o el error  y el estatus de la smismas.
