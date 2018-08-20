package com.designmode.action.t06_iterator;

import java.util.List;

public class School {
	private List<Student> listStudent;
	private int currIndex = 0;
	public School(List<Student> listStudent){
		this.listStudent = listStudent;
	}
	public Iterator iterator = new Iterator(){
		@Override
		public Object first() {
			if(listStudent == null || listStudent.size() == 0)
				return null;
			return listStudent.get(0);
		}

		@Override
		public Object next() {
			return listStudent.get(currIndex++);
		}

		@Override
		public boolean hasNext() {
			if(currIndex < listStudent.size()){
				return true;
			}else{
				return false;
			}
		}
	};
}
