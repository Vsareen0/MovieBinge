package networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.AppConstants;

public class ApiClient {
    private static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(AppConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
