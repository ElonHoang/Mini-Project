import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IndexUIComponent } from './component/index-ui/index-ui.component';
import { AddUIComponent } from './component/add-ui/add-ui.component';
import { DetailUIComponent } from './component/detail-ui/detail-ui.component';
import { UpdateUiComponent } from './component/update-ui/update-ui.component';

const routes: Routes = [
  {path: '', redirectTo:'stds', pathMatch:'full'},
  {path: 'index', component: IndexUIComponent},
  {path: 'add', component: AddUIComponent},
  {path: 'detail-ui/:id', component: DetailUIComponent},
  {path: 'update-ui/:id',component:UpdateUiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
