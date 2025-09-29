import java.util.Scanner;
import java.util.ArrayList;

public class Capstone {
	public static void signIn(ArrayList<String> sUser, ArrayList<String> sPass, Scanner in) {

		String nUser;
		String nPass;
	
	System.out.println( "\n\t\t\t\t\t=============== Sign Up ==================");

	System.out.print("\n\t\t\t\t\tEnter new username: ");
	in.nextLine();
	nUser = in.nextLine();
	System.out.print("\n\t\t\t\t\tEnter new password: ");
	nPass = in.nextLine();
	sUser.add(nUser);
	sPass.add(nPass);
	System.out.println("\n\t\t\t\t\t============ SIGN UP Successful! You can now log in ========");
}
	public static boolean logIn(ArrayList<String> pUser, ArrayList<String> pPass, Scanner in) {

		String user;
		String pass;

		pUser.add("Ranie");
		pPass.add("Yummy");

	System.out.println("\n\t\t\t\t\t=========================== Log In ========================");

	System.out.print("\n\t\t\t\t\tEnter username: ");
	in.nextLine();
	user = in.nextLine();

	System.out.print("\n\t\t\t\t\tEnter password: ");
	pass = in.nextLine();
	for (int i = 0; i < pUser.size(); i++) {

		if (pUser.get(i).equals(user) && pPass.get(i).equals(pass)) {
			System.out.println("\n\t\t\t\t\t\t\t\t LOG IN succesful!");

			System.out.println("\n\t\t\t\t\t============================================================");
			return true;
		}
}
			System.out.println("\n\t\t\t\t\t=========================== Try Again! =======================");
			return false;
}
	//TABLE LANG
	public static void table() {
		System.out.println(" \n\t\t\t\t--------------------------------------------------------------------------------------------");
		System.out.println(" \n\t\t\t\t|BUS \t|ROUTE\t\t\t|SCHEDULE (TIME) \t|SCHEDULE (DAYS) \t|FARE\t |");
		System.out.println(" \n\t\t\t\t--------------------------------------------------------------------------------------------");
		System.out.println(" \n\t\t\t\t|1 \t|Rosario - Cavite City \t|7:00 am - 8:30 am \t|Monday - Sunday \t|PHP 20.00 |");
		System.out.println(" \n\t\t\t\t|2 \t|Rosario - GenTri \t|9:00 am - 11:30 am \t|Monday - Sunday \t|PHP 15.00 |");
		System.out.println(" \n\t\t\t\t|3 \t|Rosario - Tanza \t|12:00 nn - 1:30 pm \t|Monday - Sunday \t|PHP 15.00 |");
		System.out.println(" \n\t\t\t\t|4 \t|Rosario - Naic \t|2:00 pm - 3:30 pm \t|Monday - Sunday \t|PHP 20.00 |");
		System.out.println(" \n\t\t\t\t|5 \t|Rosario - Kawit \t|5:00 pm - 6:30 pm \t|Monday - Sunday \t|PHP 15.00 |");
		System.out.println(" \n\t\t\t\t--------------------------------------------------------------------------------------------");
		}

	//MAIN
	public static void main(String[] args) {
	// Main Homw
		int c_choice, uVer = 0;;
		String pPass, pUser;
	//Main Menu 1
		int m_choice;
	//View Booking 1.1
	//Sub Menu 1.2
		int choice;
	//Create Booking
		String b_name, route = "", sched = "", days = "";
		int bus;
		double total = 0, change, b1, b2, b3, b4, b5, fare = 0;

	//assign
		b1 = 20.00;
		b2 = 15.00;
		b3 = 15.00;
		b4 = 20.00;
		b5 = 15.00;
	//Edit Booking
		int upd, field;
		double newFare = 0, difference, refund, addMoney; //total;
		String newRoute = "", new_bname;

//Cancel Booking
//upd;
//SCREEN TABLE
	ArrayList<String> t_bookingname = new ArrayList<String>();
	ArrayList<String> t_route = new ArrayList<String>();
	ArrayList<String> t_sched = new ArrayList<String>();
	ArrayList<String> t_days = new ArrayList<String>();
	ArrayList<Double> t_fare = new ArrayList<Double>();
//sa user
	ArrayList<String> nUser = new ArrayList<String>();
	ArrayList<String> nPass = new ArrayList<String>();
			t_bookingname.add("Church Event");
			t_route.add("Rosario - GenTri");
			t_sched.add("9:00 am - 11:30 am");
			t_days.add("Monday - Sunday");
			t_fare.add(15.00);
			t_bookingname.add("Practice");
			t_route.add("Rosario - Cavite City");
			t_sched.add("7:00 am - 8:30 am");
			t_days.add("Monday - Sunday");
			t_fare.add(20.00);
			t_bookingname.add("Gala with Friends");
			t_route.add("Rosario - Naic");
			t_sched.add("2:00 pm - 3:30 pm");
			t_days.add("Monday - Sunday");
			t_fare.add(20.00);
			t_bookingname.add("Workshop");
			t_route.add("Rosario - GenTri");
			t_sched.add("9:00 am - 11:30 am");
			t_days.add("Monday - Sunday");
			t_fare.add(15.00);
			t_bookingname.add("Project");
			t_route.add("Rosario - Cavite City");
			t_sched.add("7:00 am - 8:30 am");
			t_days.add("Monday - Sunday");
			t_fare.add(20.00);
	Scanner in = new Scanner(System.in);
		boolean isLog = false;
	do{
		System.out.println("\n\t\t\t\t\t============ WELCOME TO ROSARIO TRANSPO! ==================");

		System.out.println("\t\t\t\t\t\t===== where traveling is secured, safe, and fun <3 =====");

		System.out.println("\n\t\t\t\t\t======================= Main Home ========================");
		System.out.println(" \n\t\t\t\t\t[1] Sign Up");
		System.out.println(" \n\t\t\t\t\t[2] Log In");
		System.out.println(" \n\t\t\t\t\t[3] Exit");
		System.out.print("\n\t\t\t\t\tEnter Choice: ");
		c_choice = in.nextInt();

	switch(c_choice){
case 1: //sign in
signIn(nUser, nPass, in );
break;
case 2: //Login
isLog = logIn(nUser, nPass, in);
if(isLog){
break;
}
}
if (isLog == true) {
isLog = false;
// MAIN MENU
do{
System.out.println("\n\t\t\t\t\t================ WELCOME TO ROSARIO TRANSPO! ==================");
System.out.println("\t\t\t\t\t\t===== where traveling is secured, safe, and fun <3 =====");
System.out.println("\n\t\t\t\t\t================= RIDE WITH US ===================\n");
System.out.println(" \n\t\t\t\t\t[1] Book a ride");
System.out.println(" \n\t\t\t\t\t[2] View Booking");
System.out.println(" \n\t\t\t\t\t[3] Log out");
System.out.print("\n\t\t\t\t\t Enter Choice: ");
m_choice = in.nextInt();
switch (m_choice) {
case 1: {
do{
System.out.println("\n\n\t\t\t\t\t================= BOOKING MENU =====================\n");
System.out.println(" \n\t\t\t\t\t[1] Create Booking");
System.out.println(" \n\t\t\t\t\t[2] Edit Booking");
System.out.println(" \n\t\t\t\t\t[3] Cancel Booking");
System.out.println(" \n\t\t\t\t\t[4] Back to First Menu");
System.out.print("\n\t\t\t\t\t Enter choice: ");
choice = in.nextInt();
in.nextLine();
switch (choice) {
case 1: {// Create Booking
System.out.println("\n\t\t\t\t\t==================== CREATE BOOKING =========================\n");
table ();
System.out.print("\n\t\t\t\t\t Booking Name: ");
b_name = in.nextLine();
do{
System.out.print("\n\t\t\t\t\t Bus: ");
bus = in.nextInt();
if (bus < 1 || bus > 5) {
System.out.println("\n\t\t\t\t\t Invalid bus number. Please refer to the Table given above");
}
} while (bus < 1 || bus > 5);
do{
System.out.print("\n\t\t\t\t\t Input Payment: PHP ");
total = in.nextDouble();
if ((bus == 1 && total < b1) ||
(bus == 2 && total < b2) ||
(bus == 3 && total < b3) ||
(bus == 4 && total < b4) ||
(bus == 5 && total < b5)) {
System.out.println("\n\t\t\t\t\t\t Payment failed due to Insufficient Money. Please enter a valid amount.");
}
} while ((bus == 1 && total < b1) ||
(bus == 2 && total < b2) ||
(bus == 3 && total < b3) ||
(bus == 4 && total < b4) ||
(bus == 5 && total < b5));
if (bus == 1) {
route = "Rosario - Cavite City";
sched = "7:00 am - 8:30 am";
days = "Monday - Sunday";
fare = b1;
}else if (bus == 2) {
route = "Rosario - GenTri";
sched = "9:00 am - 11:30 am";
days = "Monday - Sunday";
fare = b2;
}else if (bus == 3) {
route = "Rosario - Tanza";
sched = "12:00 nn - 1:30 pm";
days = "Monday - Sunday";
fare = b3;
}else if (bus == 4) {
route = "Rosario - Naic";
sched = "2:00 pm - 3:30 pm";
days = "Monday - Sunday";
fare = b4;
}else if (bus == 5) {
route = "Rosario - Kawit";
sched = "5:00 pm - 6:30 pm";
days = "Monday - Sunday";
fare = b5;
}
//Computation ng sukli
change = total - fare;
System.out.println("\n\t\t\t\t\t Your Payment was Successful!\n");
System.out.printf("\n\t\t\t\t\t Username: %s\n", b_name);
System.out.printf("\n\t\t\t\t\t Route: %s\n", route);
System.out.printf("\n\t\t\t\t\t Total amount: PHP %.2f\n", fare);
System.out.printf("\n\t\t\t\t\t Change: PHP %.2f\n", change);
System.out.println("\n\t\t\t\t\t THANK YOU FOR BOOKING :>");
t_bookingname.add(b_name);
t_route.add(route);
t_sched.add(sched);
t_days.add(days);
t_fare.add(fare);
break;
}
case 2: {// Edit Booking
System.out.println("\n\t\t\t\t\t==================== EDIT BOOKING ========================\n");
if (t_bookingname.isEmpty()) {
System.out.println("\n\t\t\t\t\t No bookings found.");
} else {
System.out.println("\n\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.printf("\n\t\t|%-2s |%-30s |%-25s |%-20s |%-20s |%-10s|\n", "No.", "BOOKING_NAME", "ROUTE", "SCHEDULE (TIME)", "SCHEDULE (DAYS)", "FARE");
System.out.println("\n\t\t------------------------------------------------------------------------------------------------------------------------");
for (int i = 0; i < t_bookingname.size(); i++) {
System.out.printf("\n\t\t|%-3s |%-30s |%-25s |%-20s |%-20s |%-10.2f|\n", i + 1, t_bookingname.get(i), t_route.get(i), t_sched.get(i), t_days.get(i), t_fare.get(i));
System.out.println("\n\t\t------------------------------------------------------------------------------------------------------------------------");
}
}
//ask
System.out.print("\n\t\t\t\t\tWhat Booking: No. ");
upd = in.nextInt();
in.nextLine();
System.out.println("\n\t\t\t\t\tWhat field?");
System.out.println("\n\t\t\t\t\t[1] Booking_name");
System.out.println("\n\t\t\t\t\t[2] Route");
System.out.print("\n\t\t\t\t\t Enter choice: ");
field = in.nextInt();
in.nextLine();
if (field == 1) {
System.out.print("\n\t\t\t\t\t\t Enter new Booking Name: ");
new_bname = in.nextLine();
t_bookingname.set(upd - 1, new_bname);
} else if (field == 2) {
table ();
do{
System.out.print("\n\t\t\t\t\t Bus: ");
bus = in.nextInt();
in.nextLine();
if (bus < 1 || bus > 5) {
System.out.println("\n\t\t\t\t\t\t Invalid bus number. Please refer to the Table given above");
}
} while (bus < 1 || bus > 5);
switch (bus) {
case 1:
newRoute = " Rosario - Cavite City";
newFare = 20.00;
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
break;
case 2:
newRoute = "Rosario - GenTri";
newFare = 15.00;
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
break;
case 3:
newRoute = "Rosario - Tanza";
newFare = 15.00;
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
break;
case 4:
newRoute = "Rosario - Naic";
newFare = 20.00;
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
break;
case 5:
newRoute = "Rosario - Kawit";
newFare = 15.00;
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
break;
default:
System.out.println("\n\t\t\t\t\t Invalid Bus Choice.");
t_route.set(upd - 1, newRoute);
System.out.println("\n\t\t\t\t\t Route updated successfully!");
}
//new fare
fare = t_fare.get(upd - 1);
if ((newFare > fare) && (total < newFare)) {
difference = newFare - total;
System.out.printf("\n\t\t\t\t\t The fare is PHP %.2f. Kindly pay an additional PHP %.2f.\n", newFare, difference);
do{
System.out.print("\n\t\t\t\t\t Input Payment: PHP ");
addMoney = in.nextDouble();
total += addMoney;
if (total < newFare) {
System.out.println("\n\t\t\t\t\t Payment failed due to Insufficient Money. Please enter a valid amount.");
}
} while (total < newFare);
} else if ((newFare < fare) || (total > newFare)) {
refund = total - newFare;
System.out.printf("\n\t\t\t\t\t The fare is PHP %.2f. Your refund is PHP %.2f.\n", newFare, refund);
} else {
System.out.println("\n\t\t\t\t\t The fare remains unchanged and completely covered by your accumulated payment. \n\t\t\t\t\t The payment has been Successful.");
}
t_route.set(upd - 1, newRoute);
t_fare.set(upd - 1, newFare);
System.out.printf("\n\t\t\t\t\t New Route: %s\n\t\t\t\t\t New Fare: PHP %.2f\n", newRoute, newFare);
}
break;
}
case 3: {// Cancel Booking
System.out.println("\n\t\t\t\t\t==================== CANCEL BOOKING ==========================\n");
if (t_bookingname.isEmpty()) {
System.out.println("\n\t\t\t\t\t No bookings found.");
} else {
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
System.out.printf("\n\t\t |%-2s |%-30s |%-25s |%-20s |%-20s |%-10s|\n", "No.", "BOOKING_NAME", "ROUTE", "SCHEDULE (TIME)", "SCHEDULE (DAYS)", "FARE");
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
for (int i = 0; i < t_bookingname.size(); i++) {
System.out.printf("\n\t\t |%-3s |%-30s |%-25s |%-20s |%-20s |%-10.2f|\n", i + 1, t_bookingname.get(i), t_route.get(i), t_sched.get(i), t_days.get(i), t_fare.get(i));
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
}
System.out.print("\n\t\t\t\t Cancel Booking: No. ");
upd = in.nextInt();
in.nextLine();
t_bookingname.remove(upd - 1);
t_route.remove(upd - 1);
t_sched.remove(upd - 1);
t_fare.remove(upd - 1);
System.out.println("\n\t\t\t\t\t\t\t\t Booking has been CANCELLED :<");
}
break;
}
case 4: {// Back to Main Menu
System.out.println("\n\t\t\t\t\t\t Returning to Main Menu...");
break;
}
default: {
System.out.println("\n\t\t\t\t\t\t Invalid choice. Kindly try again.");
}
}
} while (choice != 4); // Loop hangga't du pinipili 4
break;
}
case 2: {
System.out.println("\n\t\t\t\t\t====== VIEW BOOKINGS =================\n");
if (t_bookingname.isEmpty()) {
System.out.println("\n\t\t\t\t\t No bookings found.");
} else {
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
System.out.printf("\n\t\t |%-2s |%-30s |%-25s |%-20s |%-20s |%-10s|", "No.", "BOOKING_NAME", "ROUTE", "SCHEDULE (TIME)", "SCHEDULE (DAYS)", "FARE");
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
for (int i = 0; i < t_bookingname.size(); i++) {
System.out.printf("\n\t\t |%-3s |%-30s |%-25s |%-20s |%-20s |%-10.2f|", i + 1, t_bookingname.get(i), t_route.get(i), t_sched.get(i), t_days.get(i), t_fare.get(i));
System.out.println("\n\t\t ------------------------------------------------------------------------------------------------------------------------");
}
}
break;
}
case 3: {
System.out.println("\n\t\t\t\t\t\t\t THANK YOU FOR USING ROSARIO TRANSPO!");
break;
}
default : {System.out.println("\n\t\t\t\t\t\t Invalid choice. Please try again.");
}
}
}while (m_choice != 3);
}
}while (c_choice != 3 );
}
}