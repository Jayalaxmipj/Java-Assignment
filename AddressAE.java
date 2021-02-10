package oops_assignment;

 class AddressAE {
	private String addressline;
	private String city;
	
		public AddressAE()
		{
			
		}
		public AddressAE(String addressline, String city) {
		super();
		this.addressline = addressline;
		this.city = city;
	}
		public void getAddressDetails() {
			
			
			System.out.println(addressline+city);
		}
		
			
		

		public String getAddressline() {
			return addressline;
		}

		public void setAddressline(String addressline) {
			this.addressline = addressline;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
//		public String getAddressDetails1()
//		{
//			String addr1=getAddressline();
//			String addr2=getCity();
//			
//			String addr=getAddressline()+","+getCity();
//			c.setResidentialAddress(addr);
//			return String.valueOf(c.getResidentialAddress());
//			
//		}
		
		
	
}

