package md5a918b1ce51186a2313297f9067dddfd5;


public class AddNew
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("DCEncyclopedia.AddNew, DCEncyclopedia, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AddNew.class, __md_methods);
	}


	public AddNew () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AddNew.class)
			mono.android.TypeManager.Activate ("DCEncyclopedia.AddNew, DCEncyclopedia, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
