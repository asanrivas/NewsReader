package com.yeayyy.newsbrowser;

import android.os.AsyncTask;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

/**
 * <code>AsyncTask</code> to load Admob advertisements
 * 
 * @author |dmb TEAM|
 * 
 */
public class LoadNewAdmobAdvertisement extends AsyncTask<Void, Void, Void> {

	/**
	 * View to hold the Admob advertisements
	 */
	private AdView mAdmobView;

	/**
	 * Constructor
	 * 
	 * @param mAdmobView
	 *            View to hold the Admob advertisementsView to hold the Admob
	 *            advertisements
	 */
	public LoadNewAdmobAdvertisement(AdView admobView) {

		this.mAdmobView = admobView;
	}

	/**
	 * Override this method to perform a computation on a background thread. The
	 * specified parameters are the parameters passed to execute(Params...) by
	 * the caller of this task. This method can call
	 * publishProgress(Progress...) to publish updates on the UI thread.
	 * 
	 * @param result
	 *            The result of the operation computed by
	 *            doInBackground(Params...).
	 * 
	 */
	@Override
	protected Void doInBackground(Void... params) {

		mAdmobView.loadAd(new AdRequest());

		publishProgress();

		return null;
	}

	/**
	 * Runs on the UI thread after publishProgress(Progress...) is invoked. The
	 * specified values are the values passed to publishProgress(Progress...).
	 */
	@Override
	protected void onProgressUpdate(Void... values) {

		super.onProgressUpdate(values);
	}

}