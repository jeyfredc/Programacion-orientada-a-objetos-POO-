# POO PROGRAMACION ORIENTADA A OBJETOS 

Análisis de los objetos, clases y métodos de la aplicación Uber

Para resolver un problema como desarrollador es de gran utilidad dividirlo en subproblemas y generar un modelo que te permita implementar las soluciones en código. A lo largo de este curso vas a analizar Uber, una de las aplicaciones más usadas en el mundo, para entender cómo está construida. A partir de este análisis harás la extracción y definición de los objetos, clases y métodos que conforman la aplicación, usarás UML para modelarla y, finalmente, usando diferentes lenguajes como Java, PHP y Python harás la implementación de las clases y objetos de la aplicación.

[Clase 1 ¿Por qué aprender Programación Orientada a Objetos?](#Clase-1-¿Por-qué-aprender-Programación-Orientada-a-Objetos?)

[Clase 2 ¿Qué resuelve la Programación Orientada a Objetos?](#Clase-2-¿Qué-resuelve-la-Programación-Orientada-a-Objetos?)

[Clase 3 Paradigma Orientado a Objetos](#Clase-3-Paradigma-Orientado-a-Objetos)

[Clase 4 Lenguajes Orientados a Objetos](#Clase-4-Lenguajes-Orientados-a-Objetos)

[Clase 5 Instalando Visual Studio Code](#Clase-5-Instalando-Visual-Studio-Code)

[Clase 6 Diagramas de Modelado](#Clase-6-Diagramas-de-Modelado)

[Clase 7 UML](#Clase-7-UML)

[]()

[]()

[]()

[]()

[]()

[]()

[]()

[]()

[]()

## Clase 1 ¿Por qué aprender Programación Orientada a Objetos?

- **Vas a programar más rápido**. Tener un análisis previo de lo que estás realizando te ayudará a generar código mucho más veloz

- **Dejas de ser Programador Jr**. Podrás responder preguntas como ¿Qué es encapsulamiento?, ¿Qué es Abstracción?, ¿Qué es Herencia?, ¿Qué es Polimorfismo? en futuras entrevistas de trabajo

- **Dejar de Copiar y Pegar Código**

Con este curso se aprende a:

- Analizar codigo y problemas mediante observación, entendimiento y lectura

- Plasmar a traves de diagramas

- Programar en distintos lenguajes de programacion orientados a objetos

## Clase 2 ¿Qué resuelve la Programación Orientada a Objetos?

La programación Orientada a Objetos nace de los problemas creados por la programación estructurada y nos ayuda a resolver cierto problemas como:

- Código muy largo: A medida que un sistema va creciendo y se hace más robusta el código generado se vuelve muy extenso haciéndose difícil de leer, depurar, mantener.

- Si algo falla, todo se rompe: Ya que con la programación estructurada el código se ejecuta secuencialmente al momento de que una de esas líneas fallara todo lo demás deja de funcionar.

- Difícil de mantener.

- Codigo Espagueti. evitar condicionales anidados que en algun punto se pueden romper o caer en un ciclo si no se sabe claramente lo que se habia realizado y cantidad de lineas de codigo que hace dificil encontrar problemas en el momento que llegue a surgir uno.

## Clase 3 Paradigma Orientado a Objetos

La **Programación Orientada a Objetos** viene de las siglas **(POO)** o **(OOP(Object oriented Programming))**, la cual viene de una filosofía o forma de pensar que es la **Orientación a Objetos** y esto surge a partir de los problemas que necesitamos plasmar en código.

Es analizar un problema en forma de objetos para después llevarlo a código, eso es la **Orientación a Objetos**.

![assets/1.png](assets/1.png)

La Programacion orientada a objetos es un **paradigma** la cual es una teoría que suministra la base y modelo para resolver problemas. 

El paradigma de Programación Orientada a Objetos se compone de 4 elementos:

- Clases

- Propiedades

- Métodos

- Objetos

Y 4 Pilares:

- Encapsulamiento

- Abstracción

- Herencia

- Polimorfismo

## Clase 4 Lenguajes Orientados a Objetos

Algunos de los lenguajes de programación Orientados a Objetos son:

![assets/2.png](assets/2.png)

Lo mas importante mas alla del lenguaje que se escoja es aprender a programar.

Es recomendable no solo especializarse en un solo lenguaje, el saber programar y conocer los diferentes paradigmas de programacion ayudan a entender otros lenguajes, de esta forma en el futuro no existira algun problema de adaptabilidad y siempre es recomendable apoyarse de la documentacion de cada lenguaje, existen foros y diferentes medios donde se pueden consultar dudas que le suceden a los programadores, una de las paginas mas populares es [stackoverflow](https://es.stackoverflow.com/).

A continuacion una descripcion corta de los lenguajes de programacion orientados a objetos:

- Java:

    – Orientado a Objetos naturalmente

    – Es muy útilizado en Android

    – Es usado del lado del servidor o Server Side
    
- PHP

    – Lenguaje interpretado

    – Pensado para la Web
    
- Python

    – Diseñado para ser fácil de usar

    – Múltiples usos: Web, Server Side, Análisis de Datos, Machine Learning, etc


- Javascript

    – Lenguaje interpretado

    – Orientado a Objetos pero basado en prototipos

    – Pensado para la Web

- C#

- Ruby

- Kotlin

## Clase 5 Instalando Visual Studio Code

Pues que comience la aventura y digo aventura porque te darás cuenta de lo emocionante que será poder trabajar 4 lenguajes de programación en un solo entorno de desarrollo y sí, precisamente eso es lo que nos resuelve Visual Studio Code el cual será nuestro campeón en este curso.

Visual Studio Code lo puedes encontrar en las tres versiones básicas de Sistema Operativo (Windows, Mac y Linux) y lo puedes descargar directo en este enlace: https://code.visualstudio.com/download. Es muy ligero y basta con un Siguiente, siguiente, siguiente para instalar.

![assets/3.png](assets/3.png)

Cuando la instalación haya finalizado verás algo como esto:

![assets/4.png](assets/4.png)

¡Súper! Todo salió bien. Ahora pasemos a configurarlo para cada lenguaje.

Primero ubica la sección de **Extensiones** o en inglés **Extensions**, además de la barra de Search porque estaremos buscando la extensión para cada lenguaje.

![assets/5.png](assets/5.png)

**Java**
___

En la barra de Search Extensions escribe: **Java Extension Pack** y da clic en el botón verde **Install**.

![assets/6.png](assets/6.png)

Ahora, para tener una mejor experiencia en Debugging, instala el Debugger for Java, el cual encuentras siguiendo el procedimiento anterior.

![assets/7.png](assets/7.png)

Listo, terminamos con Java. Aprende más en este enlace: https://code.visualstudio.com/docs/languages/java

Ahora vamos por Python.

**Python**
___

Comencemos instalando Python en nuestra computadora. Dirígete al sitio python.org y dale clic en el botón de Descargar.

![assets/8.png](assets/8.png)

Ve de la mano con el asistente hasta finalizar la instalación:

![assets/9.png](assets/9.png)

Terminaremos la configuración de Python en Visual Studio Code más adelante. Aprende más [aquí](https://code.visualstudio.com/docs/python/python-tutorial).

Mientras tanto sigamos con PHP.

**PHP**
___

Para configurar PHP buscaremos la extensión** PHP Server** y pulsamos Instalar

![assets/10.png](assets/10.png)

**JavaScript**
___

En este caso no necesitamos instalar absolutamente nada, utilizaremos el editor con su configuración por defecto.

**Comencemos nuestro proyecto**
___

Ya está todo listo, ahora dejemos creado el proyecto.

Para esto seleccionaremos la opción **Add workspace folder**

![assets/11.png](assets/11.png)

A continuación creamos una carpeta llamada **CursoPOOUber** y damos clic en Add para finalizar. Ahora generemos esta estructura de carpetas para manejar los documentos correspondientes al lenguaje de programación:

![assets/12.png](assets/12.png)

## Clase 6 Diagramas de Modelado

Son las herramientas necesarias para realizar el analisis necesario e implementar la forma en que se va a estructurar el programa a realizar mediante **POO**

**OMT:** Object Modeling Techniques. Creado en 1191, es una metodología para el análisis orientado a objetos. Lo que propone es que una vez ya esta hecho el analisis, identificacion de objetos, atributos, metodos y ya estan nombrados los objetos.

Dice la metodologia que se empiecen a implementar en un cuadro y con una serie de conectores se empieza a definir la relacion que tiene uno con otro:

![assets/13.png](assets/13.png)

**UML:** Unified Modeling Language o Lenguaje de Modelado Unificado. Creado en 1197, Tomó las bases y técnicas de OMT unificándolas. Tenemos más opciones de diagramas como lo son Clases, Casos de Uso, Objetos, Actividades, Iteración, Estados, Implementación.

Para un proyecto donde se pide una aplicacion con programacion orientada a objetos este es el grafico que representa la forma en como se puede entregar la cual se vera mas adelante

![assets/14.png](assets/14.png)

**Nota:** Las tecnicas que se deben seguir en la actualidad son **UML**, OMT ya quedo descontinuado

## Clase 7 UML

Como ya viste UML significa Unified Modeling Language el cual es un lenguaje estándar de modelado de sistemas orientados a objetos.

![assets/15.png](assets/15.png)

Esto significa que tendremos una manera gráfica de representar una situación, justo como hemos venido viendo. A continuación te voy a presentar los elementos que puedes utilizar para hacer estas representaciones.

Las clases se representan así:

![assets/16.png](assets/16.png)

En la parte superior se colocan los atributos o propiedades, y debajo las opera ciones de la clase. Notarás que el primer caracter con el que empiezan es un símbolo. Este denotará la visibilidad del atributo o método, esto es un término que tiene que ver con Encapsulamiento y veremos más adelante a detalle.

Estos son los niveles de **visibilidad** que puedes tener:

- private
+ public
# protected
~ default

Una forma de representar las relaciones que tendrá un elemento con otro es a través de las flechas en UML, y aquí tenemos varios tipos, estos son los más comunes:

**Asociación**
___

![assets/18.png](assets/18.png)

Como su nombre lo dice, notarás que cada vez que esté referenciada este tipo de flecha significará que ese elemento contiene al otro en su definición. La flecha apuntará hacia la dependencia.

![assets/17.png](assets/17.png)

Con esto vemos que la ClaseA está asociada y depende de la ClaseB.

**Herencia**
___

![assets/19.png](assets/19.png)

Siempre que veamos este tipo de flecha se estará expresando la herencia.
La dirección de la flecha irá desde el hijo hasta el padre.

![assets/20.png](assets/20.png)

Con esto vemos que la ClaseB hereda de la ClaseA

**Agregación**
___

![assets/21.png](assets/21.png)

Este se parece a la asociación en que un elemento dependerá del otro, pero en este caso será: Un elemento dependerá de muchos otros. Aquí tomamos como referencia la multiplicidad del elemento. Lo que comúnmente conocerías en Bases de Datos como Relaciones uno a muchos.

![assets/22.png](assets/22.png)

Con esto decimos que la ClaseA contiene varios elementos de la ClaseB. Estos últimos son comúnmente representados con listas o colecciones de datos.

**Composición**
___

![assets/23.png](assets/23.png)

Este es similar al anterior solo que su relación es totalmente compenetrada de tal modo que conceptualmente una de estas clases no podría vivir si no existiera la otra.

![assets/24.png](assets/24.png)

Con esto terminamos nuestro primer módulo. Vamos al siguiente para entender cómo podemos hacer un análisis y utilizar estos elementos para construir nuestro diagrama de clases de Uber.