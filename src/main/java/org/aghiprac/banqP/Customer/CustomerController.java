package org.aghiprac.banqP.Customer;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aghiprac.banqP.entities.AppUser;
import org.aghiprac.banqP.entities.Customer;
	
import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.ff4j.property.PropertyString;
import org.ff4j.web.controller.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;	
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    private static final String FEATURE1_SHOW = "feature1";
    private static final String FEATURE2_SHOW   = "feature2";
    private static final String FEATURE3_SHOW   = "feature3";
    private static final String PROPERTY_USERNAME       = "property";
    
    @Autowired
    public FF4j ff4j;
    
    private List<String> featureList=new ArrayList<String>();
        
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/login")
	 public boolean login(@RequestBody AppUser user) {
	        return
	          user.getLogin().equals("user") && user.getPwd().equals("password");
	    }
	 
	 @RequestMapping("/user")
	    public Principal user(HttpServletRequest request) {
	        String authToken = request.getHeader("Authorization")
	          .substring("Basic".length()).trim();
	        return () ->  new String(Base64.getDecoder()
	          .decode(authToken)).split(":")[0];
	    }
	
	@RequestMapping(value = "/customer",method = RequestMethod.GET)
	public List<String> test() {
		featureList.clear();
		if (ff4j.check(FEATURE1_SHOW)) {
			featureList.add(FEATURE1_SHOW);
		} 
		 	
		if (ff4j.check(FEATURE2_SHOW)) {
			featureList.add(FEATURE2_SHOW);
		} 
		if (ff4j.check(FEATURE3_SHOW)) {
			featureList .add(FEATURE3_SHOW);
		} 
      /* (!ff4j.getPropertiesStore().existProperty(PROPERTY_USERNAME)) {
            ff4j.createProperty(new PropertyString(PROPERTY_USERNAME, "aghilas"));
          //  return PROPERTY_USERNAME;
        }*/
        return featureList;
	}
	@RequestMapping(value="/customer",method = RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer c) {
			return customerService.saveCustomer(c);
	}
	@RequestMapping(value="/customer/{id}",method = RequestMethod.GET)
	public Customer getAllCustomer(@PathVariable(value = "id") Long idCustomer) {
		System.out.println(idCustomer);
		System.out.println(customerService.getCustomerById(idCustomer).getNameCustomer());
		System.out.println("ok");
		return customerService.getCustomerById(idCustomer);
	}

	

}
