package co.com.gamestore.pos.services.main.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.gamestore.framework.controller.BaseController;
import co.com.gamestore.framework.dto.BaseDTO;
import co.com.gamestore.framework.error.CustomErrorException;
import co.com.gamestore.pos.services.main.business.MainBusiness;
import co.com.gamestore.pos.services.main.model.UserDTO;
import co.com.gamestore.pos.services.main.repository.MainRepository;


//Controller
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/main")
public class MainController extends BaseController<MainBusiness, MainRepository>{
		
	public MainController() throws CustomErrorException {
		super();
	}
	/**
	 * Method to Sign in
	 * @param loginRequest
	 * @return the UserDTO or a handle exception
	 * @throws Exception
	 */
	@PostMapping(path = "/attemptLogin")
	public ResponseEntity<UserDTO> doLogin(@RequestBody Map<String,Object> loginRequest) throws Exception{
		UserDTO response = getBusiness().attemptLogin(loginRequest);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	/**
	 * Method to get document types
	 * @return
	 * @throws Exception
	 */
	@PostMapping(path = "/getDocumenTypes")
	public ResponseEntity<BaseDTO> getDocumenTypes() throws Exception{
		BaseDTO response = getBusiness().getDocumenTypes();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	/**
	 * Method to get brands
	 * @return
	 * @throws Exception
	 */
	@PostMapping(path = "/getBrands")
	public ResponseEntity<BaseDTO> getBrands() throws Exception{
		BaseDTO response = getBusiness().getBrands();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	/**
	 * Method to get technologies
	 * @return
	 * @throws Exception
	 */
	@PostMapping(path = "/getTechnologies")
	public ResponseEntity<BaseDTO> getTechnologies() throws Exception{
		BaseDTO response = getBusiness().getTechnologies();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
}

