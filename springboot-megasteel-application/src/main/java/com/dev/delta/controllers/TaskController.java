package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Employee;
import com.dev.delta.entities.Project;
import com.dev.delta.entities.Task;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.ProjectService;
import com.dev.delta.services.TaskService;

@Controller
public class TaskController {

	/**
	 * taskService
	 */
	@Autowired
	private TaskService taskService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	/**
	 * getTasks
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/tasks")
	public String getTasks(Model model) {
		List<Task> tasks = taskService.getTasks();
		List<Employee> employees = employeeService.getEmployees();

		List<Project> projects = projectService.getProjects();

		model.addAttribute("projects", projects);
		model.addAttribute("tasks", tasks);
		model.addAttribute("employees", employees);

		return "task/tasks";
	}

	/**
	 * addTask
	 * 
	 * @param task
	 * @return
	 */
	@PostMapping("/addtask")

	public String addTask(Task task) {
		taskService.save(task);
		return "redirect:/tasks";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/task/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Task task = taskService.findById(id).get();
		model.addAttribute("task", task);
		return "editActivities";
	}

	/**
	 * updateTask
	 * 
	 * @param id
	 * @param task
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetask/{id}")
	public String updateTask(@PathVariable("id") long id, @Validated Task task, BindingResult result, Model model) {

		taskService.save(task);
		return "redirect:/tasks";
	}

	/**
	 * deleteTask
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetask/{id}")
	@Transactional
	public String deleteTask(@PathVariable("id") Long id) {
		taskService.delete(id);
		return "redirect:/tasks";
	}
}
