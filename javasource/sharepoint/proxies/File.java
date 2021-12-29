// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sharepoint.proxies;

public class File
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fileMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Sharepoint.File";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MimeType("MimeType"),
		FileMeta("Sharepoint.FileMeta");

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

	public File(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Sharepoint.File"));
	}

	protected File(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fileMendixObject)
	{
		if (fileMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Sharepoint.File", fileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Sharepoint.File");

		this.fileMendixObject = fileMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'File.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sharepoint.proxies.File initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sharepoint.proxies.File.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sharepoint.proxies.File initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sharepoint.proxies.File(context, mendixObject);
	}

	public static sharepoint.proxies.File load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sharepoint.proxies.File.initialize(context, mendixObject);
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
	 * @return value of MimeType
	 */
	public final java.lang.String getMimeType()
	{
		return getMimeType(getContext());
	}

	/**
	 * @param context
	 * @return value of MimeType
	 */
	public final java.lang.String getMimeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MimeType.toString());
	}

	/**
	 * Set value of MimeType
	 * @param mimetype
	 */
	public final void setMimeType(java.lang.String mimetype)
	{
		setMimeType(getContext(), mimetype);
	}

	/**
	 * Set value of MimeType
	 * @param context
	 * @param mimetype
	 */
	public final void setMimeType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mimetype)
	{
		getMendixObject().setValue(context, MemberNames.MimeType.toString(), mimetype);
	}

	/**
	 * @return value of FileMeta
	 */
	public final sharepoint.proxies.DriveItem getFileMeta() throws com.mendix.core.CoreException
	{
		return getFileMeta(getContext());
	}

	/**
	 * @param context
	 * @return value of FileMeta
	 */
	public final sharepoint.proxies.DriveItem getFileMeta(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sharepoint.proxies.DriveItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FileMeta.toString());
		if (identifier != null)
			result = sharepoint.proxies.DriveItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FileMeta
	 * @param filemeta
	 */
	public final void setFileMeta(sharepoint.proxies.DriveItem filemeta)
	{
		setFileMeta(getContext(), filemeta);
	}

	/**
	 * Set value of FileMeta
	 * @param context
	 * @param filemeta
	 */
	public final void setFileMeta(com.mendix.systemwideinterfaces.core.IContext context, sharepoint.proxies.DriveItem filemeta)
	{
		if (filemeta == null)
			getMendixObject().setValue(context, MemberNames.FileMeta.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FileMeta.toString(), filemeta.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fileMendixObject;
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
			final sharepoint.proxies.File that = (sharepoint.proxies.File) obj;
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
		return "Sharepoint.File";
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