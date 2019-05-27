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

	// public String get國道別() {
//		return 國道別;
//	}
//	public void set國道別(String 國道別) {
//		this.國道別 = 國道別;
//	}
//	public String get方向() {
//		return 方向;
//	}
//	public void set方向(String 方向) {
//		this.方向 = 方向;
//	}
//	public String get編號() {
//		return 編號;
//	}
//	public void set編號(String 編號) {
//		this.編號 = 編號;
//	}
//	public String get設定收費區代碼() {
//		return 設定收費區代碼;
//	}
//	public void set設定收費區代碼(String 設定收費區代碼) {
//		this.設定收費區代碼 = 設定收費區代碼;
//	}
//	public String get起點交流道() {
//		return 起點交流道;
//	}
//	public void set起點交流道(String 起點交流道) {
//		this.起點交流道 = 起點交流道;
//	}
//	public String get迄點交流道() {
//		return 迄點交流道;
//	}
//	public void set迄點交流道(String 迄點交流道) {
//		this.迄點交流道 = 迄點交流道;
//	}
//	public Float get收費區設定里程() {
//		return 收費區設定里程;
//	}
//	public void set收費區設定里程(Float 收費區設定里程) {
//		this.收費區設定里程 = 收費區設定里程;
//	}
//	public Float get小型車牌價() {
//		return 小型車牌價;
//	}
//	public void set小型車牌價(Float 小型車牌價) {
//		this.小型車牌價 = 小型車牌價;
//	}
//	public Float get大型車牌價() {
//		return 大型車牌價;
//	}
//	public void set大型車牌價(Float 大型車牌價) {
//		this.大型車牌價 = 大型車牌價;
//	}
//	public Float get聯結車牌價() {
//		return 聯結車牌價;
//	}
//	public void set聯結車牌價(Float 聯結車牌價) {
//		this.聯結車牌價 = 聯結車牌價;
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