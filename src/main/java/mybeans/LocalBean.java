package mybeans;

public class LocalBean
{

	double cost;
	double markup;
	double subtotal;
	double vat;
	double total;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
		this.markup=((cost/100)*20);
		this.subtotal=cost+markup;
		this.vat=((subtotal/100)*12.5);
		this.total=subtotal+vat;
		
	}
	public double getMarkup() {
		return markup;
	}
	public void setMarkup(double markup) {
		this.markup = markup;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
