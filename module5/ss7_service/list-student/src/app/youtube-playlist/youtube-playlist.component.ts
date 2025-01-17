import { Component, OnInit } from '@angular/core';
import {Song} from "../../model/song";
import { SongService } from '../service/service/song.service';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DomSanitizer} from "@angular/platform-browser";

@Component({
  selector: 'app-youtube-playlist',
  templateUrl: './youtube-playlist.component.html',
  styleUrls: ['./youtube-playlist.component.css']
})
export class YoutubePlaylistComponent implements OnInit {

  playlist: Song[] = [];

  constructor(private songService: SongService) {
  }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.playlist = this.songService.playlist;
  }

}
