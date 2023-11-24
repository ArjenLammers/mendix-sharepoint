// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	/**
	 * @deprecated
	 * The default constructor of the Constants class should not be used.
	 * Use the static get methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Constants() {}

	// These are the constants for the MicrosoftGraph module

	/**
	* Mandatory. Used in all REST calls. current options are v1.0. or beta
	*/
	public static java.lang.String getGraphLocation()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MicrosoftGraph.GraphLocation");
	}

	/**
	* Mandatory. Used as the authorization endpoint.
	*/
	public static java.lang.String getLoginLocation()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MicrosoftGraph.LoginLocation");
	}

	public static java.lang.String getLogNode()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MicrosoftGraph.LogNode");
	}

	public static java.lang.String getMicrosoftGraphConnector_Version()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MicrosoftGraph.MicrosoftGraphConnector_Version");
	}

	/**
	* Optional. Only used in the REST call proxy configuration (in combination with ProxyPort) if this constant has a value.
	*/
	public static java.lang.String getProxyHost()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MicrosoftGraph.ProxyHost");
	}

	/**
	* Optional. Only used in the REST call proxy configuration (in combination with ProxyHost) if this constant has a value
	*/
	public static java.lang.Long getProxyPort()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("MicrosoftGraph.ProxyPort");
	}
}