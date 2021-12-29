// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Language
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject languageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Language";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Locale("Locale"),
		DisplayName("DisplayName"),
		Language_MailboxSettings("MicrosoftGraph.Language_MailboxSettings");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Language(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Language"));
	}

	protected Language(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject languageMendixObject)
	{
		if (languageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Language", languageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Language");

		this.languageMendixObject = languageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Language.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Language initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Language.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Language initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Language(context, mendixObject);
	}

	public static microsoftgraph.proxies.Language load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Language.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Locale
	 */
	public final java.lang.String getLocale()
	{
		return getLocale(getContext());
	}

	/**
	 * @param context
	 * @return value of Locale
	 */
	public final java.lang.String getLocale(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Locale.toString());
	}

	/**
	 * Set value of Locale
	 * @param locale
	 */
	public final void setLocale(java.lang.String locale)
	{
		setLocale(getContext(), locale);
	}

	/**
	 * Set value of Locale
	 * @param context
	 * @param locale
	 */
	public final void setLocale(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locale)
	{
		getMendixObject().setValue(context, MemberNames.Locale.toString(), locale);
	}

	/**
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(java.lang.String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return value of Language_MailboxSettings
	 */
	public final microsoftgraph.proxies.MailboxSettings getLanguage_MailboxSettings() throws com.mendix.core.CoreException
	{
		return getLanguage_MailboxSettings(getContext());
	}

	/**
	 * @param context
	 * @return value of Language_MailboxSettings
	 */
	public final microsoftgraph.proxies.MailboxSettings getLanguage_MailboxSettings(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.MailboxSettings result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Language_MailboxSettings.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.MailboxSettings.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Language_MailboxSettings
	 * @param language_mailboxsettings
	 */
	public final void setLanguage_MailboxSettings(microsoftgraph.proxies.MailboxSettings language_mailboxsettings)
	{
		setLanguage_MailboxSettings(getContext(), language_mailboxsettings);
	}

	/**
	 * Set value of Language_MailboxSettings
	 * @param context
	 * @param language_mailboxsettings
	 */
	public final void setLanguage_MailboxSettings(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.MailboxSettings language_mailboxsettings)
	{
		if (language_mailboxsettings == null)
			getMendixObject().setValue(context, MemberNames.Language_MailboxSettings.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Language_MailboxSettings.toString(), language_mailboxsettings.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return languageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.Language that = (microsoftgraph.proxies.Language) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MicrosoftGraph.Language";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}