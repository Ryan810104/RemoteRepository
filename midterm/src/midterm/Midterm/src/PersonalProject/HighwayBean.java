package midterm.Midterm.src.PersonalProject;

public class HighwayBean {
	private String highwayName;
	private String direct;
	private String number;
	private String code;
	private String startPoint;
	private String endPoint;
	private Float mileCharge;
	private Float chargeSmallcar;
	private Float chargeBigcar;
	private Float chargeTruck;

	public HighwayBean(String highwayName, String direct, String number, String code, String startPoint,
			String endPoint, Float mileCharge, Float chargeSmallcar, Float chargeBigcar, Float chargeTruck) {
		super();
		this.highwayName = highwayName;
		this.direct = direct;
		this.number = number;
		this.code = code;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.mileCharge = mileCharge;
		this.chargeSmallcar = chargeSmallcar;
		this.chargeBigcar = chargeBigcar;
		this.chargeTruck = chargeTruck;
	}

	@Override
	public String toString() {
		return "HighwayBean [highwayName=" + highwayName + ", direct=" + direct + ", number=" + number + ", code="
				+ code + ", startPoint=" + startPoint + ", endPoint=" + endPoint + ", mileCharge=" + mileCharge
				+ ", chargeSmallcar=" + chargeSmallcar + ", chargeBigcar=" + chargeBigcar + ", chargeTruck="
				+ chargeTruck + "]";
	}

	public HighwayBean() {
		super();
	}

	// public String get��D�O() {
//		return ��D�O;
//	}
//	public void set��D�O(String ��D�O) {
//		this.��D�O = ��D�O;
//	}
//	public String get��V() {
//		return ��V;
//	}
//	public void set��V(String ��V) {
//		this.��V = ��V;
//	}
//	public String get�s��() {
//		return �s��;
//	}
//	public void set�s��(String �s��) {
//		this.�s�� = �s��;
//	}
//	public String get�]�w���O�ϥN�X() {
//		return �]�w���O�ϥN�X;
//	}
//	public void set�]�w���O�ϥN�X(String �]�w���O�ϥN�X) {
//		this.�]�w���O�ϥN�X = �]�w���O�ϥN�X;
//	}
//	public String get�_�I��y�D() {
//		return �_�I��y�D;
//	}
//	public void set�_�I��y�D(String �_�I��y�D) {
//		this.�_�I��y�D = �_�I��y�D;
//	}
//	public String get���I��y�D() {
//		return ���I��y�D;
//	}
//	public void set���I��y�D(String ���I��y�D) {
//		this.���I��y�D = ���I��y�D;
//	}
//	public Float get���O�ϳ]�w���{() {
//		return ���O�ϳ]�w���{;
//	}
//	public void set���O�ϳ]�w���{(Float ���O�ϳ]�w���{) {
//		this.���O�ϳ]�w���{ = ���O�ϳ]�w���{;
//	}
//	public Float get�p�����P��() {
//		return �p�����P��;
//	}
//	public void set�p�����P��(Float �p�����P��) {
//		this.�p�����P�� = �p�����P��;
//	}
//	public Float get�j�����P��() {
//		return �j�����P��;
//	}
//	public void set�j�����P��(Float �j�����P��) {
//		this.�j�����P�� = �j�����P��;
//	}
//	public Float get�p�����P��() {
//		return �p�����P��;
//	}
//	public void set�p�����P��(Float �p�����P��) {
//		this.�p�����P�� = �p�����P��;
//	}
	public String getHighwayName() {
		return highwayName;
	}

	public void setHighwayName(String highwayName) {
		this.highwayName = highwayName;
	}

	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public Float getMileCharge() {
		return mileCharge;
	}

	public void setMileCharge(Float mileCharge) {
		this.mileCharge = mileCharge;
	}

	public Float getChargeSmallcar() {
		return chargeSmallcar;
	}

	public void setChargeSmallcar(Float chargeSmallcar) {
		this.chargeSmallcar = chargeSmallcar;
	}

	public Float getChargeBigcar() {
		return chargeBigcar;
	}

	public void setChargeBigcar(Float chargeBigcar) {
		this.chargeBigcar = chargeBigcar;
	}

	public Float getChargeTruck() {
		return chargeTruck;
	}

	public void setChargeTruck(Float chargeTruck) {
		this.chargeTruck = chargeTruck;
	}
}