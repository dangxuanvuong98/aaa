package oop.g8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDB {
	
	@Autowired
	private ScannerService scn;

	public void addData() {
		System.out.println("---Sinh dữ liệu giả lập---");
		System.out.print("->Số lượng thực thể: ");
		int e = scn.getInputNum(100000000);
		System.out.print("->Số lượng quan hệ: ");
		int r = scn.getInputNum(100000000);
		System.out.println("    Sinh " + e + " thực thể và " + r + " quan hệ");
		// insert code here

	}
}
