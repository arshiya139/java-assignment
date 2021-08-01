import java.util.Scanner;
class ProductData
{
String name;
int cost;
void printProduct()
{
System.out.println(" name= "+name);
System.out.println(" cost= "+cost);}}
class ProfitLossCalc extends ProductData
{
int sp;
ProfitLossCalc (String z,int x,int y)
{
this.name=z;
this.cost=x;
this.sp=y;
}
void cal()
{
int profit=0;
int loss=0;
if(sp>=cost){
profit=sp-cost;
System.out.println(" profit of rupees= "+profit);}
if(sp<cost){
loss=cost-sp;
System.out.println(" loss of rupees= "+loss);}}}
class result{
public static void main(String args[])
{
ProfitLossCalc obj=new ProfitLossCalc("electonic_radio",100,200);
obj.printProduct();
obj.cal();
}
}