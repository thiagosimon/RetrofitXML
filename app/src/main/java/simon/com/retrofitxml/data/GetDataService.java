package simon.com.retrofitxml.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import simon.com.retrofitxml.model.RetroPhoto;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
