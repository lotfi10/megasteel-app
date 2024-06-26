package com.dev.delta.data;

import com.dev.delta.entities.Activity;
import com.dev.delta.entities.Article;
import com.dev.delta.entities.BankAccount;
import com.dev.delta.entities.BankTransfer;
import com.dev.delta.entities.Breakdown;
import com.dev.delta.entities.City;
import com.dev.delta.entities.Client;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.CustomerContract;
import com.dev.delta.entities.DeliveryVoucher;
import com.dev.delta.entities.Departement;
import com.dev.delta.entities.Document;
import com.dev.delta.entities.Employee;
import com.dev.delta.entities.Event;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.ExternalProvider;
import com.dev.delta.entities.Family;
import com.dev.delta.entities.Income;
import com.dev.delta.entities.Intervention;
import com.dev.delta.entities.InterventionStatus;
import com.dev.delta.entities.Job;
import com.dev.delta.entities.JobApplicant;
import com.dev.delta.entities.JobApplication;
import com.dev.delta.entities.Leave;
import com.dev.delta.entities.Machine;
import com.dev.delta.entities.Messaging;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Operator;
import com.dev.delta.entities.Order;
import com.dev.delta.entities.OrderState;
import com.dev.delta.entities.Part;
import com.dev.delta.entities.PartOrder;
import com.dev.delta.entities.PreventiveMaintenance;
import com.dev.delta.entities.ProductionOrder;
import com.dev.delta.entities.Project;
import com.dev.delta.entities.Provider;
import com.dev.delta.entities.ProviderContract;
import com.dev.delta.entities.ProviderOrder;
import com.dev.delta.entities.PurshaseOrder;
import com.dev.delta.entities.StorageArea;
import com.dev.delta.entities.Task;
import com.dev.delta.entities.Termination;
import com.dev.delta.entities.Training;
import com.dev.delta.entities.TypeDocument;
import com.dev.delta.entities.TypeLeave;
import com.dev.delta.entities.TypeTermination;
import com.dev.delta.entities.Unit;
import com.dev.delta.entities.VAT;
import com.dev.delta.entities.Vehicule;
import com.dev.delta.entities.VehiculeModel;
import com.dev.delta.entities.VehiculeRent;
import com.dev.delta.entities.WareHouse;

public interface IDBService {

	public Notification notification = new Notification();
	public Notification notification2 = new Notification();
	public Messaging messaging = new Messaging();
	public Messaging messaging2 = new Messaging();
	public BankTransfer bankTransfer2 = new BankTransfer();
	public Project project = new Project();
	public Task task = new Task();
	public Training training = new Training();
	public TypeDocument typeDocument = new TypeDocument();
	public WareHouse wareHouse = new WareHouse();
	public TypeTermination typeTermination2 = new TypeTermination();
	public VehiculeModel vehiculeModel = new VehiculeModel();
	public VehiculeRent vehiculeRent = new VehiculeRent();
	public BankAccount bankAccount = new BankAccount();
	public BankTransfer bankTransfer = new BankTransfer();
	public City city = new City();
	public Country country = new Country();
	public Document document = new Document();
	public Event event = new Event();
	public Expense expense = new Expense();
	public ProductionOrder productionOrder = new ProductionOrder();
	public Income income = new Income();
	public OrderState orderState = new OrderState();
	public JobApplicant jobApplicant = new JobApplicant();
	public JobApplication jobApplication = new JobApplication();
	public Vehicule vehicule = new Vehicule();
	public ProviderContract providerContract = new ProviderContract();
	public Termination termination = new Termination();
	public TypeTermination typeTermination = new TypeTermination();
	public PurshaseOrder purshaseOrder = new PurshaseOrder();
	public Family family = new Family();
	public Article article = new Article();
	public Activity activity = new Activity();
	public Unit unit = new Unit();
	public Client client = new Client();
	public Machine machine = new Machine();
	public StorageArea storageArea = new StorageArea();
	public Employee employee = new Employee();
	public Breakdown breakdown = new Breakdown();
	public VAT vat = new VAT();
	public Part part = new Part();
	public DeliveryVoucher deliveryVoucher = new DeliveryVoucher();
	public Order order = new Order();
	public PreventiveMaintenance preventiveMaintenance = new PreventiveMaintenance();
	public Operator operator = new Operator();
	public Intervention intervention = new Intervention();
	public Leave leave = new Leave();
	public TypeLeave typeLeave = new TypeLeave();
	public CustomerContract customerContract = new CustomerContract();
	public ExternalProvider externalProvider = new ExternalProvider();
	public Provider provider = new Provider();
	public PartOrder partOrder = new PartOrder();
	public ProviderOrder providerOrder = new ProviderOrder();
	public Job job = new Job();
	public InterventionStatus interventionState = new InterventionStatus();
	public Departement departement = new Departement();

	public void populate();
}
