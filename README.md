![En contruccion](https://lh3.googleusercontent.com/-uapAhPHZgSQ/WSx3LmFB_WI/AAAAAAAAAtE/Pvb0yz8N5OYsMW9xNHEzC0tKCBS96DWIgCL0B/w530-d-h334-p-rw/camiseta-pou-custom-logo-600x378.jpg)

### Catch-Verbs

Catch verbs es la modificación del clásico juego de POU en el que en lugar de recoger comida este recogerá verbos.
Tiene como objetivo incentivar a que se aprendan los verbos de forma divertida y su correcta escritura.

### Descripcion del juego

El juego consiste en que se mueva al personaje por medio de las teclas. 

Como vaya avanzando en los niveles, el personaje ira cambiando de forma y tendra nuevas caracteristicas.

ejemplos:

  * run <- palabra correcta
  
  * rin <- palabra incorrecta

EL juego va cambiando de acuerdo al nivel en el que se encuentre:

### Primer nivel 

![En contruccion](https://lh3.googleusercontent.com/-iPavFdeZQGU/WSyCyjYs7eI/AAAAAAAAAxE/EHUsU88UosMBQ2nPaR9vG2gU0K1T2rN1gCL0B/w250-d-h301-p-rw/Captura%2Bde%2Bpantalla%2B2017-05-29%2B14.51.54.png)

En el primer nivel pou solo puede moverse con las teclas <-->
El villano vikingo tiene la oportunidad de lanzar pequeñas bolas de fuego que son las que dañan a
pou de forma parcial si lo tocan.

### Segundo nivel

![En contruccion](https://lh3.googleusercontent.com/-TMRH_PgUSZk/WSyCwI1D_1I/AAAAAAAAAwo/s8ct-2tyPVgujGUBT01fTeat1KZQSN8AQCL0B/w250-d-h300-p-rw/Captura%2Bde%2Bpantalla%2B2017-05-29%2B14.53.47.png)

En el segundo nivel tiene pou puede moverse por el escenario con las cuatro teclas de direccion.
El villano nube tendra la posibilidad de lanzar truenos y dañar en puntaje al personaje.

### Tercer nivel

![En contruccion](https://lh3.googleusercontent.com/-GaP0RAlr8rA/WSyCsE68t7I/AAAAAAAAAwM/agKJ0Uzm6VcPLXLJ3oARNIz-pwMErV9nQCL0B/w250-d-h303-p-rw/Captura%2Bde%2Bpantalla%2B2017-05-29%2B14.55.12%25282%2529.png)

En el tercer nivel pou tiene la habilidad de moverse por todo el escenario con las teclas de direccion.
Tambien puede lanzar pequeños pou en forma de tiros para acabar con las burbujas que lanza Gary el villano del ultimo nivel.
En el tercer nivel se tiene como limite de tiempo acabar antes de 1 minuto. El jugador tiene la oportunidad 
de acumular mas puntos mas rapidamente si acaba con las burbujas.

### clases principales y sus caracteristicas

1. Clase Menu
 * la clase menu es la encargada de mandar a llamar a todos los tipos de mundo que hay: ayuda, inicio, records, creditos.
 * en esta clase se redirecciona al primer nivel donde manda llamar a los diferentes mundos.
 
2. Clase Nivel
 * la clase nivel administra los atributos de los niveles.
 * se encarga de guardar el puntaje de cada nivel.
 
3. Clase Nivel 1
 * el nivel 1 crea los personajes del nivel al que corresponde.
 * se encarga de crear las palabras que se van a necesitar para empezar el nivel.
 
4. Clase Nivel 2
 * manda llamar a los personajes con sus nuevas caracteristicas.
 * carga las palabras nuevas y las inserta al mundo.

5. Clase Nivel 3
 * crea los personajes nuevos para este nivel.
 * carga las palabras reales = correctas y fake= incorrectas.

6. Clase villano 1
 * el villano de tipo uno es una clase que crea al personaje y le brinda sus caracteristicas.
 * el villano de tipo uno hereda a bola de fuego que sirve como proyectil para bajar puntos al heroe.

7. Clase villano 2
 * el villano de tipo dos tiene la caracteristica de moverse por el escenario.
 * el villano hereda a la clase trueno la cual sirve como proyectil para 

8. Clase Gary
 * el villano de tipo 2 es gary de la caricatura bob esponja. La cual es creada como imagen gif importada de la clase gifimage.
 * la clase hereda a burbuja que ademas de servir como proyectil esta puede continuar en el escenario a comparacion de los demas tipos de proyectil

9. Clase popu 
 * la clase popu es de tipo heroe 1 y su principal caracteristica es moverse de un lado a otro 
 * su principal caracteristica es la de comer verbos y sumar puntaje por ello.

10. Clase Popu 2
 * la clase popu2 es de tipo heroe 2, este tiene como habilidar moverse por todo el escenario para esquivar de forma mas facil los proyectiles que caen generados por el villano de tipo 2
 * este puede comer interserctando con los demas objetos y eso facilita comer muchos mas verbos que en el nivel 1

11. Clase Popu 3 
 * la clase popu3 es de tipo heroe 3 el cual tiene la habilidad de moverse por todo el escenario y comer mas facil.
 * la caracteristica que tiene que supera a los demas heroes es que este puede defenderse con tiros en forma de pequeños pou, los cuales pueden hacer desaparecer a las burbujas creadas por el villano numero 3 que es gary.

12. Clase Real
 * de las principales clases del proyecto, ya que es la encargada de instanciar los objetos de tipo palabra incorrecta
 * convierte el texto que le llega a objeto y le da un fondo y color.
 
13. Clase Fake
 * de las principales clases del proyecto, ya que es la encargada de instanciar los objetos de tipo palabra correcta
 * convierte el texto que le llega a objeto y le da un fondo y color.
 
### Profesor

 ING. RAMIREZ GAMEZ CESAR AUGUSTO
 
### Autores del proyecto
1. Morales Zamora Cristhian Saray(SarayMorales)
2. Torres Perez Josúe Andres(JossuePeerez)

### Materia

Programacion Orientado a objetos

### Semestre
- 2016-2017 /II

### Institucion
Universidad Autónoma De San Luis Potosi. 

Facultad De Ingeniería.

### Diagrama de clases 
https://drive.google.com/open?id=0B6YxNOm5gLK2VkZKVk5Pd0Y4M0U

https://drive.google.com/open?id=0B6YxNOm5gLK2LWVBeGZ6dE9Gblk

### Download proyect 
https://drive.google.com/open?id=0B6YxNOm5gLK2XzNaOHgwWk14TTg

https://www.dropbox.com/home/catch-verbs?preview=catch-verbs.zip

### Ver en GreenFoot
http://www.greenfoot.org/scenarios/19478

### Ver video
https://www.youtube.com/watch?v=W4Ym_K0leyw


 
