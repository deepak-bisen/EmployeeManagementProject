//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public class Asset {
	// Implement your code here
	String assetId;
	String assetName;
	String assetExpiry;

	public Asset(String assetId, String assetName, String assetExpiry) {
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		if (assetId != null && assetId.matches("^(DSK|LTP|IPH)-\\d{6}[HhLl]$")) {
			this.assetId = assetId;
		}
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetExpiry() {
		return assetExpiry;
	}

	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}

	// Uncomment the code given below after implementing the class
	// Do not modify the code given below

	@Override
	public String toString() {
		return "Asset Id: " + getAssetId() + ", Asset Name: " + getAssetName() + ", Asset Expiry: " + getAssetExpiry();
	}

}