package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Messaging;
import com.dev.delta.entities.Notification;
import com.dev.delta.repositories.ClientRepository;
import com.dev.delta.repositories.EmployeeRepository;
import com.dev.delta.repositories.MachineRepository;
import com.dev.delta.repositories.MessagingRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.repositories.OrderRepository;

@Controller
public class DashboardController {

	@Autowired
	NotificationRepository notificationRepository;

	@Autowired
	MessagingRepository messagingRepository;

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	MachineRepository machineRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/")
	public String home(Model model) {
		List<Messaging> messages = messagingRepository.findAll();
		List<Notification> notifications = notificationRepository.findAll();
		long orders = orderRepository.count();
		long clients = clientRepository.count();
		long machines = machineRepository.count();
		long employees = employeeRepository.count();
		model.addAttribute("messages", messages);
		model.addAttribute("notifications", notifications);
		model.addAttribute("orders", orders);
		model.addAttribute("clients", clients);
		model.addAttribute("machines", machines);
		model.addAttribute("employees", employees);
		return "dashboard/dashboard";
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "redirect:/";
	}

}
