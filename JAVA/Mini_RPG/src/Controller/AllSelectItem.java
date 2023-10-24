package Controller;

import java.util.ArrayList;

import Model.BowVO;
import Model.DAO;
import Model.ItemVO;

public class AllSelectItem {

	public void rangeAll(int menu) { // 몇번 선택했는지
		if (menu == 1) {
			AllWeapon();
		} else if (menu == 2) {
			allSword();
		} else if (menu == 3) {
			allBow();
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void allSword() {
		DAO dao = new DAO();
		ArrayList<ItemVO> Sword_db = dao.SwordcheckAll();
		System.out.println("num\tname\tpower");
		System.out.println("===========================");
		for (ItemVO SwordObject : Sword_db) {
			System.out.print(SwordObject.getItenNum() + "\t");
			System.out.print(SwordObject.getName() + "\t");
			System.out.println(SwordObject.getAttackPower());
		}
	}

	public void allBow() {
		DAO dao = new DAO();
		ArrayList<ItemVO> Bow_db = dao.BowcheckAll();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("================================");
		for (ItemVO BowObject : Bow_db) {
			System.out.print(BowObject.getItenNum() + "\t");
			System.out.print(BowObject.getName() + "\t");
			System.out.print(BowObject.getAttackPower() + "\t");
			System.out.println(((BowVO) BowObject).getDurability()); // 다운캐스팅
		}
	}

	public void AllWeapon() {
		DAO dao = new DAO();

		ArrayList<ItemVO> bowList = dao.BowcheckAll();
		ArrayList<ItemVO> SwordList = dao.SwordcheckAll();
		ArrayList<ItemVO> itemList = new ArrayList<>();

		itemList.addAll(SwordList);
		itemList.addAll(bowList);

		System.out.println("num\tname\tpower\tdurability");
		System.out.println("================================");
		for (ItemVO item : itemList) {
			System.out.print(item.getItenNum() + "\t");
			System.out.print(item.getName() + "\t");
			System.out.print(item.getAttackPower() + "\t");
			// sword 는 durability가 없음.
			try {

				System.out.println(((BowVO) item).getDurability()); // 다운캐스팅
			} catch (Exception classcaseException) {
			}
			System.out.println();

		}

	}

}
