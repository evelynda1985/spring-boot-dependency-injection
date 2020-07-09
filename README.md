# spring-boot-dependency-injection

This project consist to communite a Service class with the Controller and this last one withe the view.
How to handle two services, how to work with interfaces for Service classes, how to pass information from the Service Interface to the controller and the view.

Annotations used:
@SpringBootApplication: Configuration class, triggers auto-configuration
@EnableAutoConfiguration: para habilitar la configuración automática
@Controller: Configura esta clase como un componente de spring de tipo controlador
 @RequestMapping: para colocar el path al que se va hacer el llamado
@GetMapping: Es el request mapping de tipo post para GET
@ModelAttribute: Queremos poblar los dropdowns, y ademas se puede usar de manera general para todos los requests, para poblar basicamente
@RequestParam: poder enviar parametros por medio de la URL
@PathVariable: For sending variables in the path
@Value: Inyectar valores en el controlador desde el archivo de properties
@Service: Configura esta clase como un componente de spring de tipo Service
@Autowired: Evitar instanciar un objeto directamente, se puede usar para attributos, metodos o en constructores.
@Bean: Permite crear objecto a travez de metodos
@Primary: Permite indicar el componente que queremos indicar por defecto

