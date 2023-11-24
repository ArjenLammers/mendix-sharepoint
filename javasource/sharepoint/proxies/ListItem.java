// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sharepoint.proxies;

public class ListItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject listItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Sharepoint.ListItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DisplayName("DisplayName"),
		CreatedDateTime("CreatedDateTime"),
		ETag("ETag"),
		_id("_id"),
		LastModifiedDateTime("LastModifiedDateTime"),
		WebUrl("WebUrl"),
		CreatedByDisplayName("CreatedByDisplayName"),
		CreatedByEmail("CreatedByEmail"),
		CreatedById("CreatedById"),
		LastModifiedByEmail("LastModifiedByEmail"),
		LastModifiedById("LastModifiedById"),
		LastModifiedByDisplayName("LastModifiedByDisplayName"),
		ContentTypeDisplayName("ContentTypeDisplayName"),
		ListItem_Explorer("Sharepoint.ListItem_Explorer"),
		DriveItem_ListItem("Sharepoint.DriveItem_ListItem"),
		ListItemContentType("Sharepoint.ListItemContentType"),
		ParentReference_ListItem("Sharepoint.ParentReference_ListItem");

		private final java.lang.String metaName;

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

	public ListItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ListItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject listItemMendixObject)
	{
		if (listItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, listItemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.listItemMendixObject = listItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ListItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sharepoint.proxies.ListItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sharepoint.proxies.ListItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static sharepoint.proxies.ListItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sharepoint.proxies.ListItem(context, mendixObject);
	}

	public static sharepoint.proxies.ListItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sharepoint.proxies.ListItem.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
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
	 * @return value of CreatedDateTime
	 */
	public final java.util.Date getCreatedDateTime()
	{
		return getCreatedDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedDateTime
	 */
	public final java.util.Date getCreatedDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CreatedDateTime.toString());
	}

	/**
	 * Set value of CreatedDateTime
	 * @param createddatetime
	 */
	public final void setCreatedDateTime(java.util.Date createddatetime)
	{
		setCreatedDateTime(getContext(), createddatetime);
	}

	/**
	 * Set value of CreatedDateTime
	 * @param context
	 * @param createddatetime
	 */
	public final void setCreatedDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date createddatetime)
	{
		getMendixObject().setValue(context, MemberNames.CreatedDateTime.toString(), createddatetime);
	}

	/**
	 * @return value of ETag
	 */
	public final java.lang.String getETag()
	{
		return getETag(getContext());
	}

	/**
	 * @param context
	 * @return value of ETag
	 */
	public final java.lang.String getETag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ETag.toString());
	}

	/**
	 * Set value of ETag
	 * @param etag
	 */
	public final void setETag(java.lang.String etag)
	{
		setETag(getContext(), etag);
	}

	/**
	 * Set value of ETag
	 * @param context
	 * @param etag
	 */
	public final void setETag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String etag)
	{
		getMendixObject().setValue(context, MemberNames.ETag.toString(), etag);
	}

	/**
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of LastModifiedDateTime
	 */
	public final java.util.Date getLastModifiedDateTime()
	{
		return getLastModifiedDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedDateTime
	 */
	public final java.util.Date getLastModifiedDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastModifiedDateTime.toString());
	}

	/**
	 * Set value of LastModifiedDateTime
	 * @param lastmodifieddatetime
	 */
	public final void setLastModifiedDateTime(java.util.Date lastmodifieddatetime)
	{
		setLastModifiedDateTime(getContext(), lastmodifieddatetime);
	}

	/**
	 * Set value of LastModifiedDateTime
	 * @param context
	 * @param lastmodifieddatetime
	 */
	public final void setLastModifiedDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastmodifieddatetime)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedDateTime.toString(), lastmodifieddatetime);
	}

	/**
	 * @return value of WebUrl
	 */
	public final java.lang.String getWebUrl()
	{
		return getWebUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of WebUrl
	 */
	public final java.lang.String getWebUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WebUrl.toString());
	}

	/**
	 * Set value of WebUrl
	 * @param weburl
	 */
	public final void setWebUrl(java.lang.String weburl)
	{
		setWebUrl(getContext(), weburl);
	}

	/**
	 * Set value of WebUrl
	 * @param context
	 * @param weburl
	 */
	public final void setWebUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String weburl)
	{
		getMendixObject().setValue(context, MemberNames.WebUrl.toString(), weburl);
	}

	/**
	 * @return value of CreatedByDisplayName
	 */
	public final java.lang.String getCreatedByDisplayName()
	{
		return getCreatedByDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedByDisplayName
	 */
	public final java.lang.String getCreatedByDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CreatedByDisplayName.toString());
	}

	/**
	 * Set value of CreatedByDisplayName
	 * @param createdbydisplayname
	 */
	public final void setCreatedByDisplayName(java.lang.String createdbydisplayname)
	{
		setCreatedByDisplayName(getContext(), createdbydisplayname);
	}

	/**
	 * Set value of CreatedByDisplayName
	 * @param context
	 * @param createdbydisplayname
	 */
	public final void setCreatedByDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String createdbydisplayname)
	{
		getMendixObject().setValue(context, MemberNames.CreatedByDisplayName.toString(), createdbydisplayname);
	}

	/**
	 * @return value of CreatedByEmail
	 */
	public final java.lang.String getCreatedByEmail()
	{
		return getCreatedByEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedByEmail
	 */
	public final java.lang.String getCreatedByEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CreatedByEmail.toString());
	}

	/**
	 * Set value of CreatedByEmail
	 * @param createdbyemail
	 */
	public final void setCreatedByEmail(java.lang.String createdbyemail)
	{
		setCreatedByEmail(getContext(), createdbyemail);
	}

	/**
	 * Set value of CreatedByEmail
	 * @param context
	 * @param createdbyemail
	 */
	public final void setCreatedByEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String createdbyemail)
	{
		getMendixObject().setValue(context, MemberNames.CreatedByEmail.toString(), createdbyemail);
	}

	/**
	 * @return value of CreatedById
	 */
	public final java.lang.String getCreatedById()
	{
		return getCreatedById(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedById
	 */
	public final java.lang.String getCreatedById(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CreatedById.toString());
	}

	/**
	 * Set value of CreatedById
	 * @param createdbyid
	 */
	public final void setCreatedById(java.lang.String createdbyid)
	{
		setCreatedById(getContext(), createdbyid);
	}

	/**
	 * Set value of CreatedById
	 * @param context
	 * @param createdbyid
	 */
	public final void setCreatedById(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String createdbyid)
	{
		getMendixObject().setValue(context, MemberNames.CreatedById.toString(), createdbyid);
	}

	/**
	 * @return value of LastModifiedByEmail
	 */
	public final java.lang.String getLastModifiedByEmail()
	{
		return getLastModifiedByEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedByEmail
	 */
	public final java.lang.String getLastModifiedByEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastModifiedByEmail.toString());
	}

	/**
	 * Set value of LastModifiedByEmail
	 * @param lastmodifiedbyemail
	 */
	public final void setLastModifiedByEmail(java.lang.String lastmodifiedbyemail)
	{
		setLastModifiedByEmail(getContext(), lastmodifiedbyemail);
	}

	/**
	 * Set value of LastModifiedByEmail
	 * @param context
	 * @param lastmodifiedbyemail
	 */
	public final void setLastModifiedByEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastmodifiedbyemail)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedByEmail.toString(), lastmodifiedbyemail);
	}

	/**
	 * @return value of LastModifiedById
	 */
	public final java.lang.String getLastModifiedById()
	{
		return getLastModifiedById(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedById
	 */
	public final java.lang.String getLastModifiedById(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastModifiedById.toString());
	}

	/**
	 * Set value of LastModifiedById
	 * @param lastmodifiedbyid
	 */
	public final void setLastModifiedById(java.lang.String lastmodifiedbyid)
	{
		setLastModifiedById(getContext(), lastmodifiedbyid);
	}

	/**
	 * Set value of LastModifiedById
	 * @param context
	 * @param lastmodifiedbyid
	 */
	public final void setLastModifiedById(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastmodifiedbyid)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedById.toString(), lastmodifiedbyid);
	}

	/**
	 * @return value of LastModifiedByDisplayName
	 */
	public final java.lang.String getLastModifiedByDisplayName()
	{
		return getLastModifiedByDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedByDisplayName
	 */
	public final java.lang.String getLastModifiedByDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastModifiedByDisplayName.toString());
	}

	/**
	 * Set value of LastModifiedByDisplayName
	 * @param lastmodifiedbydisplayname
	 */
	public final void setLastModifiedByDisplayName(java.lang.String lastmodifiedbydisplayname)
	{
		setLastModifiedByDisplayName(getContext(), lastmodifiedbydisplayname);
	}

	/**
	 * Set value of LastModifiedByDisplayName
	 * @param context
	 * @param lastmodifiedbydisplayname
	 */
	public final void setLastModifiedByDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastmodifiedbydisplayname)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedByDisplayName.toString(), lastmodifiedbydisplayname);
	}

	/**
	 * @return value of ContentTypeDisplayName
	 */
	public final java.lang.String getContentTypeDisplayName()
	{
		return getContentTypeDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of ContentTypeDisplayName
	 */
	public final java.lang.String getContentTypeDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ContentTypeDisplayName.toString());
	}

	/**
	 * Set value of ContentTypeDisplayName
	 * @param contenttypedisplayname
	 */
	public final void setContentTypeDisplayName(java.lang.String contenttypedisplayname)
	{
		setContentTypeDisplayName(getContext(), contenttypedisplayname);
	}

	/**
	 * Set value of ContentTypeDisplayName
	 * @param context
	 * @param contenttypedisplayname
	 */
	public final void setContentTypeDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contenttypedisplayname)
	{
		getMendixObject().setValue(context, MemberNames.ContentTypeDisplayName.toString(), contenttypedisplayname);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ListItem_Explorer
	 */
	public final sharepoint.proxies.Explorer getListItem_Explorer() throws com.mendix.core.CoreException
	{
		return getListItem_Explorer(getContext());
	}

	/**
	 * @param context
	 * @return value of ListItem_Explorer
	 * @throws com.mendix.core.CoreException
	 */
	public final sharepoint.proxies.Explorer getListItem_Explorer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sharepoint.proxies.Explorer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ListItem_Explorer.toString());
		if (identifier != null) {
			result = sharepoint.proxies.Explorer.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ListItem_Explorer
	 * @param listitem_explorer
	 */
	public final void setListItem_Explorer(sharepoint.proxies.Explorer listitem_explorer)
	{
		setListItem_Explorer(getContext(), listitem_explorer);
	}

	/**
	 * Set value of ListItem_Explorer
	 * @param context
	 * @param listitem_explorer
	 */
	public final void setListItem_Explorer(com.mendix.systemwideinterfaces.core.IContext context, sharepoint.proxies.Explorer listitem_explorer)
	{
		if (listitem_explorer == null) {
			getMendixObject().setValue(context, MemberNames.ListItem_Explorer.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ListItem_Explorer.toString(), listitem_explorer.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DriveItem_ListItem
	 */
	public final sharepoint.proxies.DriveItem getDriveItem_ListItem() throws com.mendix.core.CoreException
	{
		return getDriveItem_ListItem(getContext());
	}

	/**
	 * @param context
	 * @return value of DriveItem_ListItem
	 * @throws com.mendix.core.CoreException
	 */
	public final sharepoint.proxies.DriveItem getDriveItem_ListItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sharepoint.proxies.DriveItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DriveItem_ListItem.toString());
		if (identifier != null) {
			result = sharepoint.proxies.DriveItem.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DriveItem_ListItem
	 * @param driveitem_listitem
	 */
	public final void setDriveItem_ListItem(sharepoint.proxies.DriveItem driveitem_listitem)
	{
		setDriveItem_ListItem(getContext(), driveitem_listitem);
	}

	/**
	 * Set value of DriveItem_ListItem
	 * @param context
	 * @param driveitem_listitem
	 */
	public final void setDriveItem_ListItem(com.mendix.systemwideinterfaces.core.IContext context, sharepoint.proxies.DriveItem driveitem_listitem)
	{
		if (driveitem_listitem == null) {
			getMendixObject().setValue(context, MemberNames.DriveItem_ListItem.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DriveItem_ListItem.toString(), driveitem_listitem.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ListItemContentType
	 */
	public final sharepoint.proxies.ContentType getListItemContentType() throws com.mendix.core.CoreException
	{
		return getListItemContentType(getContext());
	}

	/**
	 * @param context
	 * @return value of ListItemContentType
	 * @throws com.mendix.core.CoreException
	 */
	public final sharepoint.proxies.ContentType getListItemContentType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sharepoint.proxies.ContentType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ListItemContentType.toString());
		if (identifier != null) {
			result = sharepoint.proxies.ContentType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ListItemContentType
	 * @param listitemcontenttype
	 */
	public final void setListItemContentType(sharepoint.proxies.ContentType listitemcontenttype)
	{
		setListItemContentType(getContext(), listitemcontenttype);
	}

	/**
	 * Set value of ListItemContentType
	 * @param context
	 * @param listitemcontenttype
	 */
	public final void setListItemContentType(com.mendix.systemwideinterfaces.core.IContext context, sharepoint.proxies.ContentType listitemcontenttype)
	{
		if (listitemcontenttype == null) {
			getMendixObject().setValue(context, MemberNames.ListItemContentType.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ListItemContentType.toString(), listitemcontenttype.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ParentReference_ListItem
	 */
	public final sharepoint.proxies.ParentReference getParentReference_ListItem() throws com.mendix.core.CoreException
	{
		return getParentReference_ListItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentReference_ListItem
	 * @throws com.mendix.core.CoreException
	 */
	public final sharepoint.proxies.ParentReference getParentReference_ListItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sharepoint.proxies.ParentReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ParentReference_ListItem.toString());
		if (identifier != null) {
			result = sharepoint.proxies.ParentReference.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ParentReference_ListItem
	 * @param parentreference_listitem
	 */
	public final void setParentReference_ListItem(sharepoint.proxies.ParentReference parentreference_listitem)
	{
		setParentReference_ListItem(getContext(), parentreference_listitem);
	}

	/**
	 * Set value of ParentReference_ListItem
	 * @param context
	 * @param parentreference_listitem
	 */
	public final void setParentReference_ListItem(com.mendix.systemwideinterfaces.core.IContext context, sharepoint.proxies.ParentReference parentreference_listitem)
	{
		if (parentreference_listitem == null) {
			getMendixObject().setValue(context, MemberNames.ParentReference_ListItem.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ParentReference_ListItem.toString(), parentreference_listitem.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return listItemMendixObject;
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
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sharepoint.proxies.ListItem that = (sharepoint.proxies.ListItem) obj;
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
		return entityName;
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
