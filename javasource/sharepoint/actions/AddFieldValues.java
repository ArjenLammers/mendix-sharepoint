// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sharepoint.actions;

import java.text.SimpleDateFormat;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import sharepoint.proxies.Column;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.thirdparty.org.json.JSONObject;

public class AddFieldValues extends CustomJavaAction<java.lang.String>
{
	private java.lang.String json;
	private java.util.List<IMendixObject> __fields;
	private java.util.List<sharepoint.proxies.Column> fields;
	private java.lang.Boolean driveItemRequest;

	public AddFieldValues(IContext context, java.lang.String json, java.util.List<IMendixObject> fields, java.lang.Boolean driveItemRequest)
	{
		super(context);
		this.json = json;
		this.__fields = fields;
		this.driveItemRequest = driveItemRequest;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.fields = new java.util.ArrayList<sharepoint.proxies.Column>();
		if (__fields != null)
			for (IMendixObject __fieldsElement : __fields)
				this.fields.add(sharepoint.proxies.Column.initialize(getContext(), __fieldsElement));

		// BEGIN USER CODE
		JSONObject jsonObj = new JSONObject(json);
		JSONObject fields = new JSONObject();
		if (driveItemRequest) {
			JSONObject listItem;
			if (!jsonObj.has("listItem")) {
				listItem = new JSONObject();
				jsonObj.put("listItem", listItem);
			} else {
				listItem = jsonObj.getJSONObject("listItem");
			}
			listItem.put("fields", fields);
		} else {
			jsonObj.put("fields", fields);
		}
		
		for (Column field : this.fields) {
			switch (field.getColumnType()) {
			case _BOOLEAN:
				if (field.getBooleanValue() != null) {
					fields.put(field.getName(), field.getBooleanValue());
				}
				break;
			case DATETIME:
				if (field.getDateTimeValue() != null) {
					fields.put(field.getName(), 
							(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")).format(field.getDateTimeValue()));
				}
				break;
			case NUMBER:
				if (field.getNumericValue() != null) {
					fields.put(field.getName(), field.getNumericValue());
				}
				break;
			case STRING:
				if (field.getStringValue() != null) {
					fields.put(field.getName(), field.getStringValue());
				}
				break;
			}
		}
		
		return jsonObj.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "AddFieldValues";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}