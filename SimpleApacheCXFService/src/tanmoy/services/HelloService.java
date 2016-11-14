package tanmoy.services;




import generatedSource.com.tanmoy.mypackage.AdditionWebService;
import service.AdditionServiceInterface;

//@ComponentScan
public class HelloService implements AdditionWebService {

	//@Autowired
	AdditionServiceInterface addserv;
	
	public AdditionServiceInterface getAddserv() {
		return addserv;
	}

	public void setAddserv(AdditionServiceInterface addserv) {
		this.addserv = addserv;
	}

	//@Override
	public int addTwo(int arg0, int arg1) {
		return addserv.addTwo(arg0, arg1);
	}

	//@Override
	public int deleteTwo(int arg0, int arg1) {
		return addserv.deleteTwo(arg0, arg1);
	}

}
