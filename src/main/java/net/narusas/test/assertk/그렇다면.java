package net.narusas.test.assertk;

public class 그렇다면 {

	static 그렇다면 instance  = new 그렇다면();

	public 그렇다면(String 설명) {
		AssertContext.createContext();
		AssertContext.getContext().set설명(설명);
	}

	public 그렇다면() {
		this(null);
	}



	public 그렇다면 이기_때문에_() {
		return this;
	}
	public 그렇다면 이기_때문에_ = instance;

	public 그렇다면 기_때문에_() {
		return this;
	}
	public 그렇다면 기_때문에_ = instance;

	public 그렇다면 _때문에_() {
		return this;
	}

	public 그렇다면 _때문에_ = instance;



	public 그렇다면 이므로_() {
		return this;
	}
	public 그렇다면 이므로_ = instance;


	public 그렇다면 으로_() {
		return this;
	}
	public 그렇다면 으로_ = instance;
	
	public 그렇다면 되었으므로_() {
		return this;
	}

	public 그렇다면 되었으므로_ = instance;
	
	
	public 명제 으로_(Object obj) {
		AssertContext.getContext().set값(obj);
		return new 명제();
	}

	public 명제 다음_(Object obj) {
		AssertContext.getContext().set값(obj);
		return new 명제();
	}

	public 명제 다음_변수(Object obj) {
		AssertContext.getContext().set값(obj);
		return new 명제();
	}

	public 명제 다음_명제(Object obj) {
		AssertContext.getContext().set값(obj);
		return new 명제();
	}

	public 명제 다음_구문(Object obj) {
		AssertContext.getContext().set값(obj);
		return new 명제();
	}
}
