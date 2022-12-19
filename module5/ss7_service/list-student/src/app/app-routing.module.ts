import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TimelinesComponent} from "./timelines/timelines.component";
import {YoutubePlaylistComponent} from "./youtube-playlist/youtube-playlist.component";
import {ProductListComponent} from "./product/product-list/product-list.component";
import {ProductCreateComponent} from "./product/product-create/product-create.component";



// const routes: Routes = [ {
//   path: 'timelines',
//   component: TimelinesComponent
//
// }];
// let YoutubePlayerComponent;
// const routes: Routes = [
  // {
  //   path: 'youtube',
  //   component: YoutubePlaylistComponent,
  //   children: [{
  //     path: ':id',
  //     component: YoutubePlayerComponent
  //   }]
  // }
// ];
const routes: Routes = [{
  path: 'product/list',
  component: ProductListComponent
}, {
  path: 'product/create',
  component: ProductCreateComponent
}];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
