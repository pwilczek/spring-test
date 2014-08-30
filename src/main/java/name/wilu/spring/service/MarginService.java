package name.wilu.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by PLPIWIL2 on 8/30/2014.
 */
@Service("marginService")
public class MarginService {

    @Value("${margin.default}")
    private float margin;

    public long chargeMargin(long basePrice){
        return Math.round(basePrice * margin);
    }
}
