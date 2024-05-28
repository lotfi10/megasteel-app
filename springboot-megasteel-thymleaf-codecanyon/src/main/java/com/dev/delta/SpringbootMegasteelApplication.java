package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.data.ActivityDBService;
import com.dev.delta.data.ArticleDBService;
import com.dev.delta.data.BankAccountDBService;
import com.dev.delta.data.BankTransferSBService;
import com.dev.delta.data.BreakDownDBService;
import com.dev.delta.data.CityDBService;
import com.dev.delta.data.ClientDBService;
import com.dev.delta.data.CountryDBService;
import com.dev.delta.data.CustomerContractDBService;
import com.dev.delta.data.DeliveryVoucherDBService;
import com.dev.delta.data.DepartementDBService;
import com.dev.delta.data.EmployeeDBService;
import com.dev.delta.data.EventDBService;
import com.dev.delta.data.ExternalProviderDBService;
import com.dev.delta.data.FamilyDBService;
import com.dev.delta.data.InterventionDBService;
import com.dev.delta.data.InterventionStateDBService;
import com.dev.delta.data.JobDBService;
import com.dev.delta.data.LeaveDBService;
import com.dev.delta.data.MAchineDBService;
import com.dev.delta.data.MessagingDBService;
import com.dev.delta.data.NotificationDBService;
import com.dev.delta.data.OperatorDBService;
import com.dev.delta.data.OrderDBService;
import com.dev.delta.data.PartDBService;
import com.dev.delta.data.PartOrderDBService;
import com.dev.delta.data.PoviderDBService;
import com.dev.delta.data.PreventiveMaintenanceDBService;
import com.dev.delta.data.ProductionDBService;
import com.dev.delta.data.ProviderContractDBService;
import com.dev.delta.data.PurshaseOrderDBService;
import com.dev.delta.data.StorageAreaDBService;
import com.dev.delta.data.TerminitionDBService;
import com.dev.delta.data.TypeLEaveDBService;
import com.dev.delta.data.TypeTerminaisonDBService;
import com.dev.delta.data.UnitDBService;
import com.dev.delta.data.UserDBService;
import com.dev.delta.data.VATDBService;

@SpringBootApplication
public class SpringbootMegasteelApplication implements CommandLineRunner {

	@Autowired
	private ArticleDBService articleDBService;

	@Autowired
	private UserDBService userDBService;

	@Autowired
	private UnitDBService unitDBService;

	@Autowired
	private ActivityDBService activityDBService;

	@Autowired
	private FamilyDBService familyDBService;

	@Autowired
	private StorageAreaDBService areaDBService;

	@Autowired
	private MAchineDBService machineDBService;

	@Autowired
	private ClientDBService clientDBService;

	@Autowired
	private BreakDownDBService breakDownDBService;

	@Autowired
	private VATDBService vatdbService;

	@Autowired
	private DeliveryVoucherDBService deliveryVoucherDBService;

	@Autowired
	private PartDBService partDBService;

	@Autowired
	private OrderDBService orderDBService;

	@Autowired
	private PreventiveMaintenanceDBService preventiveMaintenanceDBService;

	@Autowired
	private StorageAreaDBService storageAreaDBService;

	@Autowired
	private OperatorDBService operatorDBService;

	@Autowired
	private InterventionDBService interventionDBService;

	@Autowired
	private TypeLEaveDBService typeLEaveDBService;

	@Autowired
	private LeaveDBService leaveDBService;

	@Autowired
	private CustomerContractDBService customerContractDBService;

	@Autowired
	private ExternalProviderDBService externalProviderDBService;

	@Autowired
	private PoviderDBService providerDBService;

	@Autowired
	private EmployeeDBService employeeDBService;

	@Autowired
	private InterventionStateDBService interventionStateDBService;

	@Autowired
	private JobDBService jobDBService;

	@Autowired
	private DepartementDBService departementDBService;

	@Autowired
	private PurshaseOrderDBService purshaseOrderDBService;
	
	@Autowired
	private PartOrderDBService PartOrderDBService;

	@Autowired
	private ProviderContractDBService providerContractDBService;

	@Autowired
	private TypeTerminaisonDBService TypeTerminaisonDBService;

	@Autowired
	private TerminitionDBService TerminitionDBService;

	@Autowired
	private BankAccountDBService bankAccountDBService;

	@Autowired
	private CountryDBService countryDBService;

	@Autowired
	private CityDBService cityDBService;

	@Autowired
	private EventDBService eventDBService;

	@Autowired
	private ProductionDBService productionDBService;

	@Autowired
	private BankTransferSBService bankTransferSBService;

	@Autowired
	private NotificationDBService notificationDBService;

	@Autowired
	private MessagingDBService messagingDBService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMegasteelApplication.class, args);
	}

	/**
	 * @param args
	 */
	 
	
	@Override
	public void run(String... args) throws Exception {
		departementDBService.populate();
		jobDBService.populate();
		interventionStateDBService.populate();
		partDBService.populate();
		vatdbService.populate();
		breakDownDBService.populate();
		areaDBService.populate();
		employeeDBService.populate();
		unitDBService.populate();
		articleDBService.populate();
		userDBService.populate();
		familyDBService.populate();
		activityDBService.populate();
		machineDBService.populate();
		clientDBService.populate();
		storageAreaDBService.populate();
		deliveryVoucherDBService.populate();
		interventionDBService.populate();
		preventiveMaintenanceDBService.populate();
		operatorDBService.populate();
		typeLEaveDBService.populate();
		leaveDBService.populate();
		customerContractDBService.populate();
		externalProviderDBService.populate();
		providerDBService.populate();
		orderDBService.populate();
		partDBService.populate();
		PartOrderDBService.populate();
		purshaseOrderDBService.populate();
		TypeTerminaisonDBService.populate();
		TerminitionDBService.populate();
		providerContractDBService.populate();
		bankAccountDBService.populate();
		countryDBService.populate();
		cityDBService.populate();
		bankTransferSBService.populate();
		eventDBService.populate();
		productionDBService.populate();
		messagingDBService.populate();
		notificationDBService.populate();

	}

}
