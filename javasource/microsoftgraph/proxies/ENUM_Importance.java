// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public enum ENUM_Importance
{
	low(new java.lang.String[][] { new java.lang.String[] { "en_US", "low" }, new java.lang.String[] { "nl_NL", "laag" } }),
	normal(new java.lang.String[][] { new java.lang.String[] { "en_US", "normal" }, new java.lang.String[] { "nl_NL", "normaal" } }),
	high(new java.lang.String[][] { new java.lang.String[] { "en_US", "high" }, new java.lang.String[] { "nl_NL", "hoog" } }),
	urgent(new java.lang.String[][] { new java.lang.String[] { "en_US", "urgent" }, new java.lang.String[] { "nl_NL", "urgent" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Importance(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
