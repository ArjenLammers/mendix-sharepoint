// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public enum ENUM_LifecycleEventType
{
	missed(new java.lang.String[][] { new java.lang.String[] { "en_US", "missed" }, new java.lang.String[] { "nl_NL", "missed" } }),
	subscriptionRemoved(new java.lang.String[][] { new java.lang.String[] { "en_US", "subscriptionRemoved" }, new java.lang.String[] { "nl_NL", "subscriptionRemoved" } }),
	reauthorizationRequired(new java.lang.String[][] { new java.lang.String[] { "en_US", "reauthorizationRequired" }, new java.lang.String[] { "nl_NL", "reauthorizationRequired" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_LifecycleEventType(java.lang.String[][] captionStrings)
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
