// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public enum ENUM_Prompt
{
	none(new java.lang.String[][] { new java.lang.String[] { "en_US", "none" } }),
	login(new java.lang.String[][] { new java.lang.String[] { "en_US", "login" } }),
	consent(new java.lang.String[][] { new java.lang.String[] { "en_US", "consent" } }),
	select_account(new java.lang.String[][] { new java.lang.String[] { "en_US", "select_account" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Prompt(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
