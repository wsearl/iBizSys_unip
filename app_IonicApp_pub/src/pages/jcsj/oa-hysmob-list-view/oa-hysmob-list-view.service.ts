import { IBizListService } from '../../../ibizsys/ts/widget/IBizListService'
import { IBizSearchFormService } from '../../../ibizsys/ts/widget/IBizSearchFormService'

export class mdctrlService extends IBizListService {
    constructor(opt){
        super(opt);
    }
}
export class searchformService extends IBizSearchFormService {
    constructor(opt){
        super(opt);
    }

    public regSearchItems(): void {
        this.regSearchItem({'name': 'n_syqk_eq'});
    }

    public regItems(): void {
        this.regItem({'name': 'n_syqk_eq', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'n_oa_hysname_like', 'visible': true, 'allowEmpty': false});
    }
}
