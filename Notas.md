Command (Comando):

El patrón Command se utiliza para encapsular una solicitud como un objeto, lo que permite parametrizar clientes con operaciones, encolar solicitudes y soportar operaciones que se pueden deshacer.
En el ejemplo proporcionado, el patrón Command no fue utilizado explícitamente, pero se podrían haber creado clases de comandos concretas (por ejemplo, EntregaLocalCommand, EntregaNacionalCommand y EntregaInternacionalCommand) para representar diferentes tipos de órdenes de entrega.
Un invocador (Invocador) podría ejecutar estos comandos, permitiendo así un manejo flexible de las órdenes de entrega en el sistema.

Adapter (Adaptador):

El patrón Adapter se utiliza para permitir que interfaces incompatibles trabajen juntas. Se crea un adaptador que convierte la interfaz de una clase en otra interfaz que un cliente espera.
En el ejemplo proporcionado, se implementó un adaptador (PaymentAdapter) para integrar un sistema de pago heredado con una nueva pasarela de pagos. Esto permitió que el sistema heredado utilizara la funcionalidad de la pasarela de pagos moderna sin modificar su código existente.
El adaptador actuó como un intermediario entre el sistema de pago heredado (la interfaz incompatible) y la pasarela de pagos moderna (la interfaz esperada por el cliente), proporcionando así una capa de abstracción que facilitó la integración entre los dos sistemas.

Observer (Observador):

Se utiliza para definir una relación uno a muchos entre objetos, de modo que cuando el estado de un objeto cambia, todos sus dependientes son notificados y actualizados automáticamente.
En la implementación, la clase EstacionMeteorologica actúa como el sujeto observable, y las clases Pantalla, DispositivoMovil y EstacionCentral son los observadores.
Los observadores se registran dinámicamente con la estación meteorológica y reciben notificaciones cuando cambian las condiciones climáticas.