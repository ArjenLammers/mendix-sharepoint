// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class GroupTypes extends microsoftgraph.proxies.NPStringArray
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.GroupTypes";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		GroupTypes_Group("MicrosoftGraph.GroupTypes_Group");

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

	public GroupTypes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.GroupTypes"));
	}

	protected GroupTypes(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject groupTypesMendixObject)
	{
		super(context, groupTypesMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.GroupTypes", groupTypesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.GroupTypes");
	}

	/**
	 * @deprecated Use 'GroupTypes.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.GroupTypes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.GroupTypes.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.GroupTypes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.GroupTypes(context, mendixObject);
	}

	public static microsoftgraph.proxies.GroupTypes load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.GroupTypes.initialize(context, mendixObject);
	}

	/**
	 * @return value of GroupTypes_Group
	 */
	public final microsoftgraph.proxies.Group getGroupTypes_Group() throws com.mendix.core.CoreException
	{
		return getGroupTypes_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of GroupTypes_Group
	 */
	public final microsoftgraph.proxies.Group getGroupTypes_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Group result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GroupTypes_Group.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Group.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GroupTypes_Group
	 * @param grouptypes_group
	 */
	public final void setGroupTypes_Group(microsoftgraph.proxies.Group grouptypes_group)
	{
		setGroupTypes_Group(getContext(), grouptypes_group);
	}

	/**
	 * Set value of GroupTypes_Group
	 * @param context
	 * @param grouptypes_group
	 */
	public final void setGroupTypes_Group(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Group grouptypes_group)
	{
		if (grouptypes_group == null)
			getMendixObject().setValue(context, MemberNames.GroupTypes_Group.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GroupTypes_Group.toString(), grouptypes_group.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.GroupTypes that = (microsoftgraph.proxies.GroupTypes) obj;
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
		return "MicrosoftGraph.GroupTypes";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}