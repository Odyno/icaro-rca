package net.staniscia.rca.swing.view.widget;

import net.staniscia.rca.status.CommonStatusBarContent;
import net.staniscia.rca.services.IStatusBarService;
import net.staniscia.rca.IStatusBarZone;


public class StatusBarController implements IStatusBarService {
	private CommonStatusBarContent csbr;  
	private StatusBarPanel hmi;

	
	public StatusBarController() {
		this(new CommonStatusBarContent());
	}
	
	
	public StatusBarController(CommonStatusBarContent csbr) {
		super();
		this.csbr = csbr;
		addEstraZone(new LogoStatusBarZone());
		addEstraZone(new InfoStatusBarZone(this.csbr));
		this.csbr.setShortTip("StartUp Done!");
	}

	public StatusBarPanel getComponent(){
		if (hmi==null){
			hmi=makeJC2tStatusBar();
		}
		return hmi;
	}

	private StatusBarPanel makeJC2tStatusBar() {
		StatusBarPanel out= new  StatusBarPanel();
		return out;
	}


	public void addEstraZone(IStatusBarZone sbr) {
		getComponent().addZone(sbr.getId(), sbr.getComponent(), sbr.getPreferedSize());
		
	}


	public CommonStatusBarContent getCommonZone() {
		return csbr;
	}

}
