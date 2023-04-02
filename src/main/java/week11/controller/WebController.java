/**
 * 
 */
package week11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import week11.bean.Player;
import week11.repository.PlayerRepository;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Apr 2, 2023
 */
@Controller
public class WebController {
	@Autowired
	PlayerRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllPlayers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewPlayer(model);
		}
		model.addAttribute("player",repo.findAll());
		return "results";
	}

	@GetMapping("/inputPlayer")
	public String addNewPlayer(Model model) {
		Player p = new Player();
		model.addAttribute("newPlayer", p);
		return "input";
	}
	
	@PostMapping("/inputPlayer")
	public String addNewPlayer(@ModelAttribute Player p, Model model) {
		repo.save(p);
		return viewAllPlayers(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdatePlayer(@PathVariable("id")long id, Model model) {
		Player p = repo.findById(id).orElse(null);
		model.addAttribute("newPlayer", p);
		return"input";
	}
	
	@PostMapping("/update/{id}")
	public String revisePlayer(Player p, Model model) {
		repo.save(p);
		return viewAllPlayers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deletePlayer(@PathVariable("id") long id, Model model) {
		Player p = repo.findById(id).orElse(null);
		repo.delete(p);
		return viewAllPlayers(model);
	}
}
