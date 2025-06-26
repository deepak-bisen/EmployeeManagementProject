//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public class Asset {
	private String assetId;
	private String assetName;
	private String assetExpiry;

	public Asset(String assetId, String assetName, String assetExpiry) {
		setAssetId(assetId);
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		if (assetId.matches("[A-Z]{3}-\\d{6}[A-Z]")) {
			this.assetId = assetId;
		} else {
			throw new IllegalArgumentException("Invalid asset id format");
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

	@Override
	public String toString() {
		return assetId + " - " + assetName + " (Valid till: " + assetExpiry + ")";
	}
}
