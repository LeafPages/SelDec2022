package week7.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestcases {
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}

	@Test
	public void editLead() {
		System.out.println("Edit Lead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
}
